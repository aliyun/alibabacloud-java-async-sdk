// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * ForbiddenList.
         */
        public Builder forbiddenList(java.util.List < String > forbiddenList) {
            this.forbiddenList = forbiddenList;
            return this;
        }

        /**
         * IgnoredList.
         */
        public Builder ignoredList(java.util.List < String > ignoredList) {
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

        public DeletePlayInfoResponseBody build() {
            return new DeletePlayInfoResponseBody(this);
        } 

    } 

}
