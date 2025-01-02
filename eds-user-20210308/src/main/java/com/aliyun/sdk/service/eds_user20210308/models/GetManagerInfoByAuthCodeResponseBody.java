// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678901234****</p>
         */
        public Builder orgId(String orgId) {
            this.orgId = orgId;
            return this;
        }

        /**
         * <p>The mobile number.</p>
         * 
         * <strong>example:</strong>
         * <p>1301234****</p>
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The team name.</p>
         * 
         * <strong>example:</strong>
         * <p>devteam</p>
         */
        public Builder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        /**
         * <p>The tenant name.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * <p>The ID of the Elastic Desktop Service account.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678901234****</p>
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
