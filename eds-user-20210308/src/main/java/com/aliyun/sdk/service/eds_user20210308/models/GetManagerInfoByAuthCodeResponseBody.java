// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetManagerInfoByAuthCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetManagerInfoByAuthCodeResponseBody</p>
 */
public class GetManagerInfoByAuthCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrgId")
    private String orgId;

    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TeamName")
    private String teamName;

    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.NameInMap("WaId")
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
         * The organization ID.
         */
        public Builder orgId(String orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
         * The mobile number.
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The team name.
         */
        public Builder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        /**
         * The tenant name.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * The ID of the Elastic Desktop Service account.
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
