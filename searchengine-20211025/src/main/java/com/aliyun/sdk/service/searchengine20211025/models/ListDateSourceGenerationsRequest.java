// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-7mz2ttxta01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2s170b03_test_api2</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putPathParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>The data center where the data source is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bj_vpc_domain_1</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Specifies the index versions to be returned. Valid values:</p>
         * <ol>
         * <li>true (default): returns the index versions that are complete and not expired.</li>
         * <li>false: returns all index versions.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
