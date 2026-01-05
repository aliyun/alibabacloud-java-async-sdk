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
 * {@link ListPluginClassesRequest} extends {@link RequestModel}
 *
 * <p>ListPluginClassesRequest</p>
 */
public class ListPluginClassesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aliasLike")
    private String aliasLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("excludeBuiltinAiProxy")
    private Boolean excludeBuiltinAiProxy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("installed")
    private Boolean installed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nameLike")
    private String nameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListPluginClassesRequest(Builder builder) {
        super(builder);
        this.aliasLike = builder.aliasLike;
        this.direction = builder.direction;
        this.excludeBuiltinAiProxy = builder.excludeBuiltinAiProxy;
        this.gatewayId = builder.gatewayId;
        this.gatewayType = builder.gatewayType;
        this.installed = builder.installed;
        this.nameLike = builder.nameLike;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.source = builder.source;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPluginClassesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasLike
     */
    public String getAliasLike() {
        return this.aliasLike;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return excludeBuiltinAiProxy
     */
    public Boolean getExcludeBuiltinAiProxy() {
        return this.excludeBuiltinAiProxy;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return installed
     */
    public Boolean getInstalled() {
        return this.installed;
    }

    /**
     * @return nameLike
     */
    public String getNameLike() {
        return this.nameLike;
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

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListPluginClassesRequest, Builder> {
        private String aliasLike; 
        private String direction; 
        private Boolean excludeBuiltinAiProxy; 
        private String gatewayId; 
        private String gatewayType; 
        private Boolean installed; 
        private String nameLike; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String source; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListPluginClassesRequest request) {
            super(request);
            this.aliasLike = request.aliasLike;
            this.direction = request.direction;
            this.excludeBuiltinAiProxy = request.excludeBuiltinAiProxy;
            this.gatewayId = request.gatewayId;
            this.gatewayType = request.gatewayType;
            this.installed = request.installed;
            this.nameLike = request.nameLike;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.source = request.source;
            this.type = request.type;
        } 

        /**
         * aliasLike.
         */
        public Builder aliasLike(String aliasLike) {
            this.putQueryParameter("aliasLike", aliasLike);
            this.aliasLike = aliasLike;
            return this;
        }

        /**
         * direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * excludeBuiltinAiProxy.
         */
        public Builder excludeBuiltinAiProxy(Boolean excludeBuiltinAiProxy) {
            this.putQueryParameter("excludeBuiltinAiProxy", excludeBuiltinAiProxy);
            this.excludeBuiltinAiProxy = excludeBuiltinAiProxy;
            return this;
        }

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * gatewayType.
         */
        public Builder gatewayType(String gatewayType) {
            this.putQueryParameter("gatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * installed.
         */
        public Builder installed(Boolean installed) {
            this.putQueryParameter("installed", installed);
            this.installed = installed;
            return this;
        }

        /**
         * nameLike.
         */
        public Builder nameLike(String nameLike) {
            this.putQueryParameter("nameLike", nameLike);
            this.nameLike = nameLike;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListPluginClassesRequest build() {
            return new ListPluginClassesRequest(this);
        } 

    } 

}
