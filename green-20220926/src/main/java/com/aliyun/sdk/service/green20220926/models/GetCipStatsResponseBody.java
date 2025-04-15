// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetCipStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetCipStatsResponseBody</p>
 */
public class GetCipStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCipStatsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCipStatsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetCipStatsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCipStatsResponseBody build() {
            return new GetCipStatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCipStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCipStatsResponseBody</p>
     */
    public static class ImageTreeChar extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ImageTreeChar(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageTreeChar create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(ImageTreeChar model) {
                this.description = model.description;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ImageTreeChar build() {
                return new ImageTreeChar(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCipStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCipStatsResponseBody</p>
     */
    public static class TextTreeChart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TextTreeChart(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextTreeChart create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(TextTreeChart model) {
                this.description = model.description;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TextTreeChart build() {
                return new TextTreeChart(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCipStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCipStatsResponseBody</p>
     */
    public static class TreeChart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TreeChart(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TreeChart create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(TreeChart model) {
                this.description = model.description;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TreeChart build() {
                return new TreeChart(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCipStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCipStatsResponseBody</p>
     */
    public static class VoiceTreeChart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private VoiceTreeChart(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceTreeChart create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(VoiceTreeChart model) {
                this.description = model.description;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public VoiceTreeChart build() {
                return new VoiceTreeChart(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCipStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCipStatsResponseBody</p>
     */
    public static class Y extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Long> data;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Y(Builder builder) {
            this.data = builder.data;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Y create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Long> getData() {
            return this.data;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<Long> data; 
            private String name; 

            private Builder() {
            } 

            private Builder(Y model) {
                this.data = model.data;
                this.name = model.name;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<Long> data) {
                this.data = data;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Y build() {
                return new Y(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCipStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCipStatsResponseBody</p>
     */
    public static class LabelStatChart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageTreeChar")
        private java.util.List<ImageTreeChar> imageTreeChar;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("TextTreeChart")
        private java.util.List<TextTreeChart> textTreeChart;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("TreeChart")
        private java.util.List<TreeChart> treeChart;

        @com.aliyun.core.annotation.NameInMap("VoiceTreeChart")
        private java.util.List<VoiceTreeChart> voiceTreeChart;

        @com.aliyun.core.annotation.NameInMap("X")
        private java.util.List<String> x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private java.util.List<Y> y;

        private LabelStatChart(Builder builder) {
            this.imageTreeChar = builder.imageTreeChar;
            this.serviceCode = builder.serviceCode;
            this.textTreeChart = builder.textTreeChart;
            this.totalCount = builder.totalCount;
            this.treeChart = builder.treeChart;
            this.voiceTreeChart = builder.voiceTreeChart;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelStatChart create() {
            return builder().build();
        }

        /**
         * @return imageTreeChar
         */
        public java.util.List<ImageTreeChar> getImageTreeChar() {
            return this.imageTreeChar;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return textTreeChart
         */
        public java.util.List<TextTreeChart> getTextTreeChart() {
            return this.textTreeChart;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return treeChart
         */
        public java.util.List<TreeChart> getTreeChart() {
            return this.treeChart;
        }

        /**
         * @return voiceTreeChart
         */
        public java.util.List<VoiceTreeChart> getVoiceTreeChart() {
            return this.voiceTreeChart;
        }

        /**
         * @return x
         */
        public java.util.List<String> getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public java.util.List<Y> getY() {
            return this.y;
        }

        public static final class Builder {
            private java.util.List<ImageTreeChar> imageTreeChar; 
            private String serviceCode; 
            private java.util.List<TextTreeChart> textTreeChart; 
            private Long totalCount; 
            private java.util.List<TreeChart> treeChart; 
            private java.util.List<VoiceTreeChart> voiceTreeChart; 
            private java.util.List<String> x; 
            private java.util.List<Y> y; 

            private Builder() {
            } 

            private Builder(LabelStatChart model) {
                this.imageTreeChar = model.imageTreeChar;
                this.serviceCode = model.serviceCode;
                this.textTreeChart = model.textTreeChart;
                this.totalCount = model.totalCount;
                this.treeChart = model.treeChart;
                this.voiceTreeChart = model.voiceTreeChart;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * ImageTreeChar.
             */
            public Builder imageTreeChar(java.util.List<ImageTreeChar> imageTreeChar) {
                this.imageTreeChar = imageTreeChar;
                return this;
            }

            /**
             * ServiceCode.
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * TextTreeChart.
             */
            public Builder textTreeChart(java.util.List<TextTreeChart> textTreeChart) {
                this.textTreeChart = textTreeChart;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TreeChart.
             */
            public Builder treeChart(java.util.List<TreeChart> treeChart) {
                this.treeChart = treeChart;
                return this;
            }

            /**
             * VoiceTreeChart.
             */
            public Builder voiceTreeChart(java.util.List<VoiceTreeChart> voiceTreeChart) {
                this.voiceTreeChart = voiceTreeChart;
                return this;
            }

            /**
             * X.
             */
            public Builder x(java.util.List<String> x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(java.util.List<Y> y) {
                this.y = y;
                return this;
            }

            public LabelStatChart build() {
                return new LabelStatChart(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCipStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCipStatsResponseBody</p>
     */
    public static class DataY extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Long> data;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DataY(Builder builder) {
            this.data = builder.data;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataY create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Long> getData() {
            return this.data;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<Long> data; 
            private String name; 

            private Builder() {
            } 

            private Builder(DataY model) {
                this.data = model.data;
                this.name = model.name;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<Long> data) {
                this.data = data;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DataY build() {
                return new DataY(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCipStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCipStatsResponseBody</p>
     */
    public static class Z extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Long> data;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Z(Builder builder) {
            this.data = builder.data;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Z create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Long> getData() {
            return this.data;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<Long> data; 
            private String name; 

            private Builder() {
            } 

            private Builder(Z model) {
                this.data = model.data;
                this.name = model.name;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<Long> data) {
                this.data = data;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Z build() {
                return new Z(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCipStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCipStatsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LabelStatChart")
        private java.util.List<LabelStatChart> labelStatChart;

        @com.aliyun.core.annotation.NameInMap("TotalStat")
        private java.util.Map<String, ?> totalStat;

        @com.aliyun.core.annotation.NameInMap("Uids")
        private java.util.List<String> uids;

        @com.aliyun.core.annotation.NameInMap("X")
        private java.util.List<String> x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private java.util.List<DataY> y;

        @com.aliyun.core.annotation.NameInMap("Z")
        private java.util.List<Z> z;

        private Data(Builder builder) {
            this.labelStatChart = builder.labelStatChart;
            this.totalStat = builder.totalStat;
            this.uids = builder.uids;
            this.x = builder.x;
            this.y = builder.y;
            this.z = builder.z;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return labelStatChart
         */
        public java.util.List<LabelStatChart> getLabelStatChart() {
            return this.labelStatChart;
        }

        /**
         * @return totalStat
         */
        public java.util.Map<String, ?> getTotalStat() {
            return this.totalStat;
        }

        /**
         * @return uids
         */
        public java.util.List<String> getUids() {
            return this.uids;
        }

        /**
         * @return x
         */
        public java.util.List<String> getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public java.util.List<DataY> getY() {
            return this.y;
        }

        /**
         * @return z
         */
        public java.util.List<Z> getZ() {
            return this.z;
        }

        public static final class Builder {
            private java.util.List<LabelStatChart> labelStatChart; 
            private java.util.Map<String, ?> totalStat; 
            private java.util.List<String> uids; 
            private java.util.List<String> x; 
            private java.util.List<DataY> y; 
            private java.util.List<Z> z; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.labelStatChart = model.labelStatChart;
                this.totalStat = model.totalStat;
                this.uids = model.uids;
                this.x = model.x;
                this.y = model.y;
                this.z = model.z;
            } 

            /**
             * LabelStatChart.
             */
            public Builder labelStatChart(java.util.List<LabelStatChart> labelStatChart) {
                this.labelStatChart = labelStatChart;
                return this;
            }

            /**
             * TotalStat.
             */
            public Builder totalStat(java.util.Map<String, ?> totalStat) {
                this.totalStat = totalStat;
                return this;
            }

            /**
             * Uids.
             */
            public Builder uids(java.util.List<String> uids) {
                this.uids = uids;
                return this;
            }

            /**
             * X.
             */
            public Builder x(java.util.List<String> x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(java.util.List<DataY> y) {
                this.y = y;
                return this;
            }

            /**
             * Z.
             */
            public Builder z(java.util.List<Z> z) {
                this.z = z;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
