// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link ListQosPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListQosPoliciesRequest</p>
 */
public class ListQosPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FederationId")
    private String federationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputRegionId;

    private ListQosPoliciesRequest(Builder builder) {
        super(builder);
        this.federationId = builder.federationId;
        this.fileSystemId = builder.fileSystemId;
        this.inputRegionId = builder.inputRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQosPoliciesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return federationId
     */
    public String getFederationId() {
        return this.federationId;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public static final class Builder extends Request.Builder<ListQosPoliciesRequest, Builder> {
        private String federationId; 
        private String fileSystemId; 
        private String inputRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListQosPoliciesRequest request) {
            super(request);
            this.federationId = request.federationId;
            this.fileSystemId = request.fileSystemId;
            this.inputRegionId = request.inputRegionId;
        } 

        /**
         * FederationId.
         */
        public Builder federationId(String federationId) {
            this.putQueryParameter("FederationId", federationId);
            this.federationId = federationId;
            return this;
        }

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        @Override
        public ListQosPoliciesRequest build() {
            return new ListQosPoliciesRequest(this);
        } 

    } 

}
