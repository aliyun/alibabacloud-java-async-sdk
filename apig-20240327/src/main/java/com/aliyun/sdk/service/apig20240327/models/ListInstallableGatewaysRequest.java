// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListInstallableGatewaysRequest} extends {@link RequestModel}
 *
 * <p>ListInstallableGatewaysRequest</p>
 */
public class ListInstallableGatewaysRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pluginClassId")
    private String pluginClassId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private ListInstallableGatewaysRequest(Builder builder) {
        super(builder);
        this.pluginClassId = builder.pluginClassId;
        this.gatewayType = builder.gatewayType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstallableGatewaysRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pluginClassId
     */
    public String getPluginClassId() {
        return this.pluginClassId;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListInstallableGatewaysRequest, Builder> {
        private String pluginClassId; 
        private String gatewayType; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListInstallableGatewaysRequest request) {
            super(request);
            this.pluginClassId = request.pluginClassId;
            this.gatewayType = request.gatewayType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The plugin class ID. This is a path parameter and cannot be empty. The plugin class must exist.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-xxxx</p>
         */
        public Builder pluginClassId(String pluginClassId) {
            this.putPathParameter("pluginClassId", pluginClassId);
            this.pluginClassId = pluginClassId;
            return this;
        }

        /**
         * <p>The gateway type used for filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>AI</p>
         */
        public Builder gatewayType(String gatewayType) {
            this.putQueryParameter("gatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListInstallableGatewaysRequest build() {
            return new ListInstallableGatewaysRequest(this);
        } 

    } 

}
