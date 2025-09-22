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
 * {@link AddFolderResponseBody} extends {@link TeaModel}
 *
 * <p>AddFolderResponseBody</p>
 */
public class AddFolderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private FolderItem data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private AddFolderResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFolderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public FolderItem getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FolderItem data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddFolderResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(FolderItem data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddFolderResponseBody build() {
            return new AddFolderResponseBody(this);
        } 

    } 

}
