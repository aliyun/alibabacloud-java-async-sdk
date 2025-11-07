// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link CreateCloudauthstSceneResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCloudauthstSceneResponseBody</p>
 */
public class CreateCloudauthstSceneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private Boolean resultObject;

    private CreateCloudauthstSceneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudauthstSceneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public Boolean getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean resultObject; 

        private Builder() {
        } 

        private Builder(CreateCloudauthstSceneResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>ID of this request</p>
         * 
         * <strong>example:</strong>
         * <p>5A6229C0-E156-48E4-B6EC-0F528BDF60D2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result, indicating whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder resultObject(Boolean resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public CreateCloudauthstSceneResponseBody build() {
            return new CreateCloudauthstSceneResponseBody(this);
        } 

    } 

}
