// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersRequest} extends {@link RequestModel}
 *
 * <p>ListUsersRequest</p>
 */
public class ListUsersRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("pageNumber")
    private Long pageNumber;

    @Body
    @NameInMap("pageSize")
    private Long pageSize;

    @Body
    @NameInMap("phone")
    private String phone;

    @Body
    @NameInMap("ramId")
    private String ramId;

    @Body
    @NameInMap("scene")
    private Long scene;

    @Body
    @NameInMap("synergyChannel")
    private String synergyChannel;

    @Body
    @NameInMap("username")
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

        private Builder(ListUsersRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.phone = response.phone;
            this.ramId = response.ramId;
            this.scene = response.scene;
            this.synergyChannel = response.synergyChannel;
            this.username = response.username;
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
         * 分页参数
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 分页参数
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 人员手机号
         */
        public Builder phone(String phone) {
            this.putBodyParameter("phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * ramID
         */
        public Builder ramId(String ramId) {
            this.putBodyParameter("ramId", ramId);
            this.ramId = ramId;
            return this;
        }

        /**
         * USER_LIST列表 ALL_USERS下拉
         */
        public Builder scene(Long scene) {
            this.putBodyParameter("scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * 移动应用协同渠道
         */
        public Builder synergyChannel(String synergyChannel) {
            this.putBodyParameter("synergyChannel", synergyChannel);
            this.synergyChannel = synergyChannel;
            return this;
        }

        /**
         * 人员名称
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
