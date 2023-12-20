// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDateSourceGenerationsRequest} extends {@link RequestModel}
 *
 * <p>ListDateSourceGenerationsRequest</p>
 */
public class ListDateSourceGenerationsRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("dataSourceName")
    @Validation(required = true)
    private String dataSourceName;

    @Query
    @NameInMap("domainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("validStatus")
    private Boolean validStatus;

    private ListDateSourceGenerationsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dataSourceName = builder.dataSourceName;
        this.domainName = builder.domainName;
        this.validStatus = builder.validStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDateSourceGenerationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return validStatus
     */
    public Boolean getValidStatus() {
        return this.validStatus;
    }

    public static final class Builder extends Request.Builder<ListDateSourceGenerationsRequest, Builder> {
        private String instanceId; 
        private String dataSourceName; 
        private String domainName; 
        private Boolean validStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListDateSourceGenerationsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dataSourceName = request.dataSourceName;
            this.domainName = request.domainName;
            this.validStatus = request.validStatus;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the data source.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putPathParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * The data center where the data source is deployed.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The valid state of the data source. Valid values: true and false. The default value of this parameter is true.
         * <p>
         * 
         * 1.  true indicates that the generations that have not expired and of which the tasks have been executed are returned.
         * 2.  false indicates that all generations are returned.
         */
        public Builder validStatus(Boolean validStatus) {
            this.putQueryParameter("validStatus", validStatus);
            this.validStatus = validStatus;
            return this;
        }

        @Override
        public ListDateSourceGenerationsRequest build() {
            return new ListDateSourceGenerationsRequest(this);
        } 

    } 

}
