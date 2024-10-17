// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeletePlayInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePlayInfoResponseBody</p>
 */
public class DeletePlayInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForbiddenList")
    private java.util.List < String > forbiddenList;

    @com.aliyun.core.annotation.NameInMap("IgnoredList")
    private java.util.List < String > ignoredList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeletePlayInfoResponseBody(Builder builder) {
        this.forbiddenList = builder.forbiddenList;
        this.ignoredList = builder.ignoredList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePlayInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return forbiddenList
     */
    public java.util.List < String > getForbiddenList() {
        return this.forbiddenList;
    }

    /**
     * @return ignoredList
     */
    public java.util.List < String > getIgnoredList() {
        return this.ignoredList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > forbiddenList; 
        private java.util.List < String > ignoredList; 
        private String requestId; 

        /**
         * <p>The URLs of the media streams that cannot be deleted. Generally, media streams cannot be deleted if you do not have the required permissions.</p>
         */
        public Builder forbiddenList(java.util.List < String > forbiddenList) {
            this.forbiddenList = forbiddenList;
            return this;
        }

        /**
         * <p>The URLs of ignored media streams. An error occurred while obtaining such media assets because the IDs or URLs of the media assets do not exist.</p>
         */
        public Builder ignoredList(java.util.List < String > ignoredList) {
            this.ignoredList = ignoredList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeletePlayInfoResponseBody build() {
            return new DeletePlayInfoResponseBody(this);
        } 

    } 

}
