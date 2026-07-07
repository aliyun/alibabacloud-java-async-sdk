// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602.models;

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
 * {@link ListSecureSkillIdentitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecureSkillIdentitiesResponseBody</p>
 */
public class ListSecureSkillIdentitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Identities")
    private java.util.List<String> identities;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListSecureSkillIdentitiesResponseBody(Builder builder) {
        this.identities = builder.identities;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecureSkillIdentitiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identities
     */
    public java.util.List<String> getIdentities() {
        return this.identities;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<String> identities; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListSecureSkillIdentitiesResponseBody model) {
            this.identities = model.identities;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Identities.
         */
        public Builder identities(java.util.List<String> identities) {
            this.identities = identities;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSecureSkillIdentitiesResponseBody build() {
            return new ListSecureSkillIdentitiesResponseBody(this);
        } 

    } 

}
