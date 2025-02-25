// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetQuotaUsageRequest} extends {@link RequestModel}
 *
 * <p>GetQuotaUsageRequest</p>
 */
public class GetQuotaUsageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aggMethod")
    private String aggMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("from")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("plotTypes")
    private java.util.List<String> plotTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("productId")
    private String productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("subQuotaNickname")
    private String subQuotaNickname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("to")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long to;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("yAxisTypes")
    private java.util.List<String> yAxisTypes;

    private GetQuotaUsageRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.aggMethod = builder.aggMethod;
        this.from = builder.from;
        this.plotTypes = builder.plotTypes;
        this.productId = builder.productId;
        this.region = builder.region;
        this.subQuotaNickname = builder.subQuotaNickname;
        this.tenantId = builder.tenantId;
        this.to = builder.to;
        this.yAxisTypes = builder.yAxisTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return aggMethod
     */
    public String getAggMethod() {
        return this.aggMethod;
    }

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return plotTypes
     */
    public java.util.List<String> getPlotTypes() {
        return this.plotTypes;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return subQuotaNickname
     */
    public String getSubQuotaNickname() {
        return this.subQuotaNickname;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    /**
     * @return yAxisTypes
     */
    public java.util.List<String> getYAxisTypes() {
        return this.yAxisTypes;
    }

    public static final class Builder extends Request.Builder<GetQuotaUsageRequest, Builder> {
        private String nickname; 
        private String aggMethod; 
        private Long from; 
        private java.util.List<String> plotTypes; 
        private String productId; 
        private String region; 
        private String subQuotaNickname; 
        private String tenantId; 
        private Long to; 
        private java.util.List<String> yAxisTypes; 

        private Builder() {
            super();
        } 

        private Builder(GetQuotaUsageRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.aggMethod = request.aggMethod;
            this.from = request.from;
            this.plotTypes = request.plotTypes;
            this.productId = request.productId;
            this.region = request.region;
            this.subQuotaNickname = request.subQuotaNickname;
            this.tenantId = request.tenantId;
            this.to = request.to;
            this.yAxisTypes = request.yAxisTypes;
        } 

        /**
         * <p>The alias of the level-1 quota.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>os_quota_p</p>
         */
        public Builder nickname(String nickname) {
            this.putPathParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * <p>The aggregation algorithm. For a better page experience, up to 60 points can be displayed for each metric. If you select a time range longer than 1 hour, the chart uses the average value within the range (minutes of the selected time range/60) to aggregate data by default. You can change the aggregation algorithm based on your business requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>max</p>
         */
        public Builder aggMethod(String aggMethod) {
            this.putQueryParameter("aggMethod", aggMethod);
            this.aggMethod = aggMethod;
            return this;
        }

        /**
         * <p>The time when the query starts. The value is the log time that is specified when log data is written.</p>
         * <ul>
         * <li>The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the <strong>from</strong> parameter, but does not include the end time specified by the <strong>to</strong> parameter. If you set the <strong>from</strong> and <strong>to</strong> parameters to the same value, the time range is invalid and an error message is returned.</li>
         * <li>This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1669081045</p>
         */
        public Builder from(Long from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The types of the charts.</p>
         */
        public Builder plotTypes(java.util.List<String> plotTypes) {
            String plotTypesShrink = shrink(plotTypes, "plotTypes", "simple");
            this.putQueryParameter("plotTypes", plotTypesShrink);
            this.plotTypes = plotTypes;
            return this;
        }

        /**
         * <p>The quota type. Default value: ODPS.</p>
         * <ul>
         * <li>ODPS: computing quota</li>
         * <li>TUNNEL: Tunnel quota</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ODPS</p>
         */
        public Builder productId(String productId) {
            this.putQueryParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The alias of the level-2 quota.</p>
         * 
         * <strong>example:</strong>
         * <p>ot_tunnel_quota</p>
         */
        public Builder subQuotaNickname(String subQuotaNickname) {
            this.putQueryParameter("subQuotaNickname", subQuotaNickname);
            this.subQuotaNickname = subQuotaNickname;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can log on to the MaxCompute console, and choose Tenants &gt; Tenant Property from the left-side navigation pane to view the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>478403690625249</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The time when the query ends. The value is the log time that is specified when log data is written.</p>
         * <ul>
         * <li>The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the <strong>from</strong> parameter, but does not include the end time specified by the <strong>to</strong> parameter. If you set the <strong>from</strong> and <strong>to</strong> parameters to the same value, the time range is invalid and an error message is returned.</li>
         * <li>This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1669360870</p>
         */
        public Builder to(Long to) {
            this.putQueryParameter("to", to);
            this.to = to;
            return this;
        }

        /**
         * <p>The data metric fields.</p>
         */
        public Builder yAxisTypes(java.util.List<String> yAxisTypes) {
            String yAxisTypesShrink = shrink(yAxisTypes, "yAxisTypes", "simple");
            this.putQueryParameter("yAxisTypes", yAxisTypesShrink);
            this.yAxisTypes = yAxisTypes;
            return this;
        }

        @Override
        public GetQuotaUsageRequest build() {
            return new GetQuotaUsageRequest(this);
        } 

    } 

}
