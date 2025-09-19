// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetCheckCountStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetCheckCountStatisticRequest</p>
 */
public class GetCheckCountStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticType")
    private String statisticType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskSources")
    private java.util.List<String> taskSources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendors")
    private java.util.List<String> vendors;

    private GetCheckCountStatisticRequest(Builder builder) {
        super(builder);
        this.statisticType = builder.statisticType;
        this.taskSources = builder.taskSources;
        this.vendors = builder.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckCountStatisticRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return statisticType
     */
    public String getStatisticType() {
        return this.statisticType;
    }

    /**
     * @return taskSources
     */
    public java.util.List<String> getTaskSources() {
        return this.taskSources;
    }

    /**
     * @return vendors
     */
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

    public static final class Builder extends Request.Builder<GetCheckCountStatisticRequest, Builder> {
        private String statisticType; 
        private java.util.List<String> taskSources; 
        private java.util.List<String> vendors; 

        private Builder() {
            super();
        } 

        private Builder(GetCheckCountStatisticRequest request) {
            super(request);
            this.statisticType = request.statisticType;
            this.taskSources = request.taskSources;
            this.vendors = request.vendors;
        } 

        /**
         * <p>The type of the statistics. Valid values:</p>
         * <ul>
         * <li><strong>user</strong>: the top five users that are granted excessive permissions.</li>
         * <li><strong>role</strong>: the top five roles that are granted excessive permissions.</li>
         * <li><strong>instance</strong>: the top five cloud services on which risks are detected.</li>
         * <li><strong>host</strong>: the top five servers on which baseline risks are detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        public Builder statisticType(String statisticType) {
            this.putQueryParameter("StatisticType", statisticType);
            this.statisticType = statisticType;
            return this;
        }

        /**
         * TaskSources.
         */
        public Builder taskSources(java.util.List<String> taskSources) {
            this.putQueryParameter("TaskSources", taskSources);
            this.taskSources = taskSources;
            return this;
        }

        /**
         * <p>The cloud service providers.</p>
         */
        public Builder vendors(java.util.List<String> vendors) {
            this.putQueryParameter("Vendors", vendors);
            this.vendors = vendors;
            return this;
        }

        @Override
        public GetCheckCountStatisticRequest build() {
            return new GetCheckCountStatisticRequest(this);
        } 

    } 

}
