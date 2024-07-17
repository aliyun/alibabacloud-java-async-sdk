// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDateSourceGenerationsRequest} extends {@link RequestModel}
 *
 * <p>ListDateSourceGenerationsRequest</p>
 */
public class ListDateSourceGenerationsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("dataSourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("domainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("validStatus")
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
         * The instance ID.
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
         * Specifies the index versions to be returned. Valid values:
         * <p>
         * 
         * 1.  true (default): returns the index versions that are complete and not expired.
         * 2.  false: returns all index versions.
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
