// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulTargetStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulTargetStatisticsRequest</p>
 */
public class DescribeVulTargetStatisticsRequest extends Request {
    @Query
    @NameInMap("Type")
    private String type;

    private DescribeVulTargetStatisticsRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulTargetStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeVulTargetStatisticsRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulTargetStatisticsRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * The type of the vulnerability. Valid values:
         * <p>
         * 
         * *   **cve**: Linux software vulnerability
         * *   **sys**: Windows system vulnerability
         * *   **cms**: Web-CMS vulnerability
         * *   **emg**: urgent vulnerability
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeVulTargetStatisticsRequest build() {
            return new DescribeVulTargetStatisticsRequest(this);
        } 

    } 

}
