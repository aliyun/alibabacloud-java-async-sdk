// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersRequest} extends {@link RequestModel}
 *
 * <p>ListUsersRequest</p>
 */
public class ListUsersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ramId")
    private String ramId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scene")
    private Long scene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("synergyChannel")
    private String synergyChannel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("username")
    private String username;

    private ListUsersRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.phone = builder.phone;
        this.ramId = builder.ramId;
        this.scene = builder.scene;
        this.synergyChannel = builder.synergyChannel;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return ramId
     */
    public String getRamId() {
        return this.ramId;
    }

    /**
     * @return scene
     */
    public Long getScene() {
        return this.scene;
    }

    /**
     * @return synergyChannel
     */
    public String getSynergyChannel() {
        return this.synergyChannel;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ListUsersRequest, Builder> {
        private String clientToken; 
        private Long pageNumber; 
        private Long pageSize; 
        private String phone; 
        private String ramId; 
        private Long scene; 
        private String synergyChannel; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ListUsersRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.phone = request.phone;
            this.ramId = request.ramId;
            this.scene = request.scene;
            this.synergyChannel = request.synergyChannel;
            this.username = request.username;
        } 

        /**
         * clientToken
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * phone.
         */
        public Builder phone(String phone) {
            this.putBodyParameter("phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * ramId.
         */
        public Builder ramId(String ramId) {
            this.putBodyParameter("ramId", ramId);
            this.ramId = ramId;
            return this;
        }

        /**
         * scene.
         */
        public Builder scene(Long scene) {
            this.putBodyParameter("scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * synergyChannel.
         */
        public Builder synergyChannel(String synergyChannel) {
            this.putBodyParameter("synergyChannel", synergyChannel);
            this.synergyChannel = synergyChannel;
            return this;
        }

        /**
         * username.
         */
        public Builder username(String username) {
            this.putBodyParameter("username", username);
            this.username = username;
            return this;
        }

        @Override
        public ListUsersRequest build() {
            return new ListUsersRequest(this);
        } 

    } 

}
