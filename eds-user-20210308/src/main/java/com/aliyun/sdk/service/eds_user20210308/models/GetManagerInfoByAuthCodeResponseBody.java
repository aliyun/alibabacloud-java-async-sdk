// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetManagerInfoByAuthCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetManagerInfoByAuthCodeResponseBody</p>
 */
public class GetManagerInfoByAuthCodeResponseBody extends TeaModel {
    @NameInMap("OrgId")
    private String orgId;

    @NameInMap("Phone")
    private String phone;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TeamName")
    private String teamName;

    @NameInMap("UserName")
    private String userName;

    @NameInMap("WaId")
    private Long waId;

    private GetManagerInfoByAuthCodeResponseBody(Builder builder) {
        this.orgId = builder.orgId;
        this.phone = builder.phone;
        this.requestId = builder.requestId;
        this.teamName = builder.teamName;
        this.userName = builder.userName;
        this.waId = builder.waId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetManagerInfoByAuthCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return teamName
     */
    public String getTeamName() {
        return this.teamName;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return waId
     */
    public Long getWaId() {
        return this.waId;
    }

    public static final class Builder {
        private String orgId; 
        private String phone; 
        private String requestId; 
        private String teamName; 
        private String userName; 
        private Long waId; 

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TeamName.
         */
        public Builder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * WaId.
         */
        public Builder waId(Long waId) {
            this.waId = waId;
            return this;
        }

        public GetManagerInfoByAuthCodeResponseBody build() {
            return new GetManagerInfoByAuthCodeResponseBody(this);
        } 

    } 

}
