// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitDynamicChartJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitDynamicChartJobRequest</p>
 */
public class SubmitDynamicChartJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AxisParams")
    private String axisParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Background")
    private String background;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChartConfig")
    private String chartConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChartTitle")
    private String chartTitle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChartType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chartType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSource")
    private String dataSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private String input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subtitle")
    private String subtitle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Unit")
    private String unit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitDynamicChartJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.axisParams = builder.axisParams;
        this.background = builder.background;
        this.chartConfig = builder.chartConfig;
        this.chartTitle = builder.chartTitle;
        this.chartType = builder.chartType;
        this.dataSource = builder.dataSource;
        this.description = builder.description;
        this.input = builder.input;
        this.outputConfig = builder.outputConfig;
        this.subtitle = builder.subtitle;
        this.title = builder.title;
        this.unit = builder.unit;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDynamicChartJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return axisParams
     */
    public String getAxisParams() {
        return this.axisParams;
    }

    /**
     * @return background
     */
    public String getBackground() {
        return this.background;
    }

    /**
     * @return chartConfig
     */
    public String getChartConfig() {
        return this.chartConfig;
    }

    /**
     * @return chartTitle
     */
    public String getChartTitle() {
        return this.chartTitle;
    }

    /**
     * @return chartType
     */
    public String getChartType() {
        return this.chartType;
    }

    /**
     * @return dataSource
     */
    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return outputConfig
     */
    public String getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * @return subtitle
     */
    public String getSubtitle() {
        return this.subtitle;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitDynamicChartJobRequest, Builder> {
        private String regionId; 
        private String axisParams; 
        private String background; 
        private String chartConfig; 
        private String chartTitle; 
        private String chartType; 
        private String dataSource; 
        private String description; 
        private String input; 
        private String outputConfig; 
        private String subtitle; 
        private String title; 
        private String unit; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitDynamicChartJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.axisParams = request.axisParams;
            this.background = request.background;
            this.chartConfig = request.chartConfig;
            this.chartTitle = request.chartTitle;
            this.chartType = request.chartType;
            this.dataSource = request.dataSource;
            this.description = request.description;
            this.input = request.input;
            this.outputConfig = request.outputConfig;
            this.subtitle = request.subtitle;
            this.title = request.title;
            this.unit = request.unit;
            this.userData = request.userData;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The axis configurations. If XAxisFontInterval is set to 0 or left empty, the system automatically determines an optimal interval.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;FontFile&quot;:&quot;Microsoft YaHei&quot;,&quot;XAxisFontSize&quot;:&quot;30&quot;,&quot;YAxisFontSize&quot;:&quot;30&quot;,&quot;XAxisFontInterval&quot;:&quot;30&quot;,&quot;AxisColor&quot;:&quot;30&quot;}</p>
         */
        public Builder axisParams(String axisParams) {
            this.putQueryParameter("AxisParams", axisParams);
            this.axisParams = axisParams;
            return this;
        }

        /**
         * <p>The chart background.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Color&quot;:&quot;#000000&quot;,&quot;ImageUrl&quot;:&quot;<a href="http://your-bucket.oss-cn-shanghai.aliyuncs.com/obj.jpg%22%7D">http://your-bucket.oss-cn-shanghai.aliyuncs.com/obj.jpg&quot;}</a></p>
         */
        public Builder background(String background) {
            this.putQueryParameter("Background", background);
            this.background = background;
            return this;
        }

        /**
         * <p>The chart configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Style&quot;:&quot;Normal&quot;,&quot;TitleStartTime&quot;:&quot;3000&quot;,&quot;ChartStartTime&quot;:&quot;3000&quot;,&quot;VideoDuration&quot;:&quot;15000&quot;}</p>
         */
        public Builder chartConfig(String chartConfig) {
            this.putQueryParameter("ChartConfig", chartConfig);
            this.chartConfig = chartConfig;
            return this;
        }

        /**
         * <p>The chart title.</p>
         */
        public Builder chartTitle(String chartTitle) {
            this.putQueryParameter("ChartTitle", chartTitle);
            this.chartTitle = chartTitle;
            return this;
        }

        /**
         * <p>The chart type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Line: line chart</li>
         * <li>Histogram: bar chart</li>
         * <li>Pie: pie chart</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Line</p>
         */
        public Builder chartType(String chartType) {
            this.putQueryParameter("ChartType", chartType);
            this.chartType = chartType;
            return this;
        }

        /**
         * <p>The data source.</p>
         */
        public Builder dataSource(String dataSource) {
            this.putQueryParameter("DataSource", dataSource);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * <p>The job description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The input data for the chart.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;XlsFile&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/obj.xls%22%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/obj.xls&quot;}</a></p>
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * <p>The output configurations.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MediaURL&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/obj.mp4%22,%22Bitrate%22:2000,%22Width%22:800,%22Height%22:680%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/obj.mp4&quot;,&quot;Bitrate&quot;:2000,&quot;Width&quot;:800,&quot;Height&quot;:680}</a></p>
         */
        public Builder outputConfig(String outputConfig) {
            this.putQueryParameter("OutputConfig", outputConfig);
            this.outputConfig = outputConfig;
            return this;
        }

        /**
         * <p>The subtitle.</p>
         */
        public Builder subtitle(String subtitle) {
            this.putQueryParameter("Subtitle", subtitle);
            this.subtitle = subtitle;
            return this;
        }

        /**
         * <p>The job title.</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>Unit</p>
         */
        public Builder unit(String unit) {
            this.putQueryParameter("Unit", unit);
            this.unit = unit;
            return this;
        }

        /**
         * <p>The custom data in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;user&quot;:&quot;data&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitDynamicChartJobRequest build() {
            return new SubmitDynamicChartJobRequest(this);
        } 

    } 

}
