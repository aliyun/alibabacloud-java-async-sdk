// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeSlrGrantResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlrGrantResponseBody</p>
 */
public class DescribeSlrGrantResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsGranted")
    private Boolean isGranted;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserType")
    private String userType;

    private DescribeSlrGrantResponseBody(Builder builder) {
        this.isGranted = builder.isGranted;
        this.requestId = builder.requestId;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlrGrantResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isGranted
     */
    public Boolean getIsGranted() {
        return this.isGranted;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder {
        private Boolean isGranted; 
        private String requestId; 
        private String userType; 

        private Builder() {
        } 

        private Builder(DescribeSlrGrantResponseBody model) {
            this.isGranted = model.isGranted;
            this.requestId = model.requestId;
            this.userType = model.userType;
        } 

        /**
         * <p>Indicates whether the authorization is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isGranted(Boolean isGranted) {
            this.isGranted = isGranted;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1BD3D277-AE2F-5609-893F-FF7A72A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The type of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>sub</p>
         */
        public Builder userType(String userType) {
            this.userType = userType;
            return this;
        }

        public DescribeSlrGrantResponseBody build() {
            return new DescribeSlrGrantResponseBody(this);
        } 

    } 

}
