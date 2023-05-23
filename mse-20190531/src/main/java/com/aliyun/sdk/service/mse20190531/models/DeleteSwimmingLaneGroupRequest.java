// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSwimmingLaneGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteSwimmingLaneGroupRequest</p>
 */
public class DeleteSwimmingLaneGroupRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("Namespace")
    @Validation(maxLength = 64)
    private String namespace;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("name")
    private String name;

    private DeleteSwimmingLaneGroupRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.groupId = builder.groupId;
        this.namespace = builder.namespace;
        this.region = builder.region;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSwimmingLaneGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DeleteSwimmingLaneGroupRequest, Builder> {
        private String acceptLanguage; 
        private Long groupId; 
        private String namespace; 
        private String region; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSwimmingLaneGroupRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.groupId = request.groupId;
            this.namespace = request.namespace;
            this.region = request.region;
            this.name = request.name;
        } 

        /**
         * 返回结果显示的语言。取值：zh（默认值）：中文，en：英文
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * MSE命名空间名字
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteSwimmingLaneGroupRequest build() {
            return new DeleteSwimmingLaneGroupRequest(this);
        } 

    } 

}
