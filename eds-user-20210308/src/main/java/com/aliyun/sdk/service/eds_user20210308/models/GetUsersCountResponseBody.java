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
 * {@link GetUsersCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetUsersCountResponseBody</p>
 */
public class GetUsersCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupCount")
    private Integer groupCount;

    @com.aliyun.core.annotation.NameInMap("MaxUserNumber")
    private Integer maxUserNumber;

    @com.aliyun.core.annotation.NameInMap("OrgCount")
    private Integer orgCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserCount")
    private Integer userCount;

    private GetUsersCountResponseBody(Builder builder) {
        this.groupCount = builder.groupCount;
        this.maxUserNumber = builder.maxUserNumber;
        this.orgCount = builder.orgCount;
        this.requestId = builder.requestId;
        this.userCount = builder.userCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUsersCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupCount
     */
    public Integer getGroupCount() {
        return this.groupCount;
    }

    /**
     * @return maxUserNumber
     */
    public Integer getMaxUserNumber() {
        return this.maxUserNumber;
    }

    /**
     * @return orgCount
     */
    public Integer getOrgCount() {
        return this.orgCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userCount
     */
    public Integer getUserCount() {
        return this.userCount;
    }

    public static final class Builder {
        private Integer groupCount; 
        private Integer maxUserNumber; 
        private Integer orgCount; 
        private String requestId; 
        private Integer userCount; 

        private Builder() {
        } 

        private Builder(GetUsersCountResponseBody model) {
            this.groupCount = model.groupCount;
            this.maxUserNumber = model.maxUserNumber;
            this.orgCount = model.orgCount;
            this.requestId = model.requestId;
            this.userCount = model.userCount;
        } 

        /**
         * <p>The number of user groups.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder groupCount(Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }

        /**
         * <p>The user quota.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder maxUserNumber(Integer maxUserNumber) {
            this.maxUserNumber = maxUserNumber;
            return this;
        }

        /**
         * <p>The number of organizations.</p>
         * 
         * <strong>example:</strong>
         * <p>278</p>
         */
        public Builder orgCount(Integer orgCount) {
            this.orgCount = orgCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9677D40F-0040-5956-A0EB-11B8B88****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of users.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder userCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }

        public GetUsersCountResponseBody build() {
            return new GetUsersCountResponseBody(this);
        } 

    } 

}
