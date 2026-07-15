// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link DeleteMediasResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMediasResponseBody</p>
 */
public class DeleteMediasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForbiddenList")
    private java.util.List<String> forbiddenList;

    @com.aliyun.core.annotation.NameInMap("IgnoredList")
    private java.util.List<String> ignoredList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteMediasResponseBody(Builder builder) {
        this.forbiddenList = builder.forbiddenList;
        this.ignoredList = builder.ignoredList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forbiddenList
     */
    public java.util.List<String> getForbiddenList() {
        return this.forbiddenList;
    }

    /**
     * @return ignoredList
     */
    public java.util.List<String> getIgnoredList() {
        return this.ignoredList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> forbiddenList; 
        private java.util.List<String> ignoredList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteMediasResponseBody model) {
            this.forbiddenList = model.forbiddenList;
            this.ignoredList = model.ignoredList;
            this.requestId = model.requestId;
        } 

        /**
         * ForbiddenList.
         */
        public Builder forbiddenList(java.util.List<String> forbiddenList) {
            this.forbiddenList = forbiddenList;
            return this;
        }

        /**
         * IgnoredList.
         */
        public Builder ignoredList(java.util.List<String> ignoredList) {
            this.ignoredList = ignoredList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteMediasResponseBody build() {
            return new DeleteMediasResponseBody(this);
        } 

    } 

}
