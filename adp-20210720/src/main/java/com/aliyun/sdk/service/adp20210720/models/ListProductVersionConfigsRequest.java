// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductVersionConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListProductVersionConfigsRequest</p>
 */
public class ListProductVersionConfigsRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Query
    @NameInMap("componentReleaseName")
    private String componentReleaseName;

    @Query
    @NameInMap("configType")
    private String configType;

    @Query
    @NameInMap("fuzzy")
    private String fuzzy;

    @Query
    @NameInMap("pageNum")
    private String pageNum;

    @Query
    @NameInMap("pageSize")
    private String pageSize;

    @Query
    @NameInMap("parameter")
    private String parameter;

    @Query
    @NameInMap("scope")
    private String scope;

    private ListProductVersionConfigsRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.componentReleaseName = builder.componentReleaseName;
        this.configType = builder.configType;
        this.fuzzy = builder.fuzzy;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.parameter = builder.parameter;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductVersionConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return componentReleaseName
     */
    public String getComponentReleaseName() {
        return this.componentReleaseName;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return fuzzy
     */
    public String getFuzzy() {
        return this.fuzzy;
    }

    /**
     * @return pageNum
     */
    public String getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parameter
     */
    public String getParameter() {
        return this.parameter;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<ListProductVersionConfigsRequest, Builder> {
        private String uid; 
        private String componentReleaseName; 
        private String configType; 
        private String fuzzy; 
        private String pageNum; 
        private String pageSize; 
        private String parameter; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(ListProductVersionConfigsRequest request) {
            super(request);
            this.uid = request.uid;
            this.componentReleaseName = request.componentReleaseName;
            this.configType = request.configType;
            this.fuzzy = request.fuzzy;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.parameter = request.parameter;
            this.scope = request.scope;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * componentReleaseName.
         */
        public Builder componentReleaseName(String componentReleaseName) {
            this.putQueryParameter("componentReleaseName", componentReleaseName);
            this.componentReleaseName = componentReleaseName;
            return this;
        }

        /**
         * configType.
         */
        public Builder configType(String configType) {
            this.putQueryParameter("configType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * fuzzy.
         */
        public Builder fuzzy(String fuzzy) {
            this.putQueryParameter("fuzzy", fuzzy);
            this.fuzzy = fuzzy;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(String pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * parameter.
         */
        public Builder parameter(String parameter) {
            this.putQueryParameter("parameter", parameter);
            this.parameter = parameter;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public ListProductVersionConfigsRequest build() {
            return new ListProductVersionConfigsRequest(this);
        } 

    } 

}
