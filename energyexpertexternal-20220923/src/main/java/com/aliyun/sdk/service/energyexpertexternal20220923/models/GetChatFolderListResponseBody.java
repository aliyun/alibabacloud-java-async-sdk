// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetChatFolderListResponseBody} extends {@link TeaModel}
 *
 * <p>GetChatFolderListResponseBody</p>
 */
public class GetChatFolderListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<ChatFolderItem> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetChatFolderListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatFolderListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<ChatFolderItem> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ChatFolderItem> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetChatFolderListResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Returned data</p>
         */
        public Builder data(java.util.List<ChatFolderItem> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A8AEC6D9-A359-5169-BD1A-BD848BA60D65</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetChatFolderListResponseBody build() {
            return new GetChatFolderListResponseBody(this);
        } 

    } 

}
