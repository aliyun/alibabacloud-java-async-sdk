// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ListCollectionPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListCollectionPoliciesRequest</p>
 */
public class ListCollectionPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("centralProject")
    private String centralProject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataCode")
    private String dataCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("offset")
    private Integer offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("policyName")
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("productCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer size;

    private ListCollectionPoliciesRequest(Builder builder) {
        super(builder);
        this.centralProject = builder.centralProject;
        this.dataCode = builder.dataCode;
        this.instanceId = builder.instanceId;
        this.offset = builder.offset;
        this.policyName = builder.policyName;
        this.productCode = builder.productCode;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCollectionPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return centralProject
     */
    public String getCentralProject() {
        return this.centralProject;
    }

    /**
     * @return dataCode
     */
    public String getDataCode() {
        return this.dataCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListCollectionPoliciesRequest, Builder> {
        private String centralProject; 
        private String dataCode; 
        private String instanceId; 
        private Integer offset; 
        private String policyName; 
        private String productCode; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListCollectionPoliciesRequest request) {
            super(request);
            this.centralProject = request.centralProject;
            this.dataCode = request.dataCode;
            this.instanceId = request.instanceId;
            this.offset = request.offset;
            this.policyName = request.policyName;
            this.productCode = request.productCode;
            this.size = request.size;
        } 

        /**
         * centralProject.
         */
        public Builder centralProject(String centralProject) {
            this.putQueryParameter("centralProject", centralProject);
            this.centralProject = centralProject;
            return this;
        }

        /**
         * dataCode.
         */
        public Builder dataCode(String dataCode) {
            this.putQueryParameter("dataCode", dataCode);
            this.dataCode = dataCode;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * policyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("policyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>The code of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("productCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListCollectionPoliciesRequest build() {
            return new ListCollectionPoliciesRequest(this);
        } 

    } 

}
