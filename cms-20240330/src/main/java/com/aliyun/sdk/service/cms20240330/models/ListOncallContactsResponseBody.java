// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListOncallContactsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOncallContactsResponseBody</p>
 */
public class ListOncallContactsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contactIds")
    private java.util.List<String> contactIds;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListOncallContactsResponseBody(Builder builder) {
        this.contactIds = builder.contactIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOncallContactsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactIds
     */
    public java.util.List<String> getContactIds() {
        return this.contactIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> contactIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListOncallContactsResponseBody model) {
            this.contactIds = model.contactIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the contacts.</p>
         */
        public Builder contactIds(java.util.List<String> contactIds) {
            this.contactIds = contactIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOncallContactsResponseBody build() {
            return new ListOncallContactsResponseBody(this);
        } 

    } 

}
