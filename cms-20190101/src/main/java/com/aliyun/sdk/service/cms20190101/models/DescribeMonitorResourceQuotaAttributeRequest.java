// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMonitorResourceQuotaAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitorResourceQuotaAttributeRequest</p>
 */
public class DescribeMonitorResourceQuotaAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowUsed")
    private Boolean showUsed;

    private DescribeMonitorResourceQuotaAttributeRequest(Builder builder) {
        super(builder);
        this.showUsed = builder.showUsed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorResourceQuotaAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return showUsed
     */
    public Boolean getShowUsed() {
        return this.showUsed;
    }

    public static final class Builder extends Request.Builder<DescribeMonitorResourceQuotaAttributeRequest, Builder> {
        private Boolean showUsed; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMonitorResourceQuotaAttributeRequest request) {
            super(request);
            this.showUsed = request.showUsed;
        } 

        /**
         * <p>Specifies whether to return information about used quotas. Valid values:</p>
         * <ul>
         * <li>true (default): yes</li>
         * <li>false: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder showUsed(Boolean showUsed) {
            this.putQueryParameter("ShowUsed", showUsed);
            this.showUsed = showUsed;
            return this;
        }

        @Override
        public DescribeMonitorResourceQuotaAttributeRequest build() {
            return new DescribeMonitorResourceQuotaAttributeRequest(this);
        } 

    } 

}
