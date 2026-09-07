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
         * GroupCount.
         */
        public Builder groupCount(Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }

        /**
         * MaxUserNumber.
         */
        public Builder maxUserNumber(Integer maxUserNumber) {
            this.maxUserNumber = maxUserNumber;
            return this;
        }

        /**
         * OrgCount.
         */
        public Builder orgCount(Integer orgCount) {
            this.orgCount = orgCount;
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
         * UserCount.
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
