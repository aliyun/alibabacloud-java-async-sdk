// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link DeleteMediaInfosResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMediaInfosResponseBody</p>
 */
public class DeleteMediaInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForbiddenList")
    private java.util.List<String> forbiddenList;

    @com.aliyun.core.annotation.NameInMap("IgnoredList")
    private java.util.List<String> ignoredList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteMediaInfosResponseBody(Builder builder) {
        this.forbiddenList = builder.forbiddenList;
        this.ignoredList = builder.ignoredList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediaInfosResponseBody create() {
        return builder().build();
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

        /**
         * <p>The IDs or URLs of media assets that cannot be deleted. Generally, media assets cannot be deleted if you do not have the required permissions.</p>
         */
        public Builder forbiddenList(java.util.List<String> forbiddenList) {
            this.forbiddenList = forbiddenList;
            return this;
        }

        /**
         * <p>The IDs or URLs of ignored media assets. An error occurred while obtaining such media assets.</p>
         */
        public Builder ignoredList(java.util.List<String> ignoredList) {
            this.ignoredList = ignoredList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0622C702-41BE-467E-AF2E-883D4517962E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteMediaInfosResponseBody build() {
            return new DeleteMediaInfosResponseBody(this);
        } 

    } 

}
