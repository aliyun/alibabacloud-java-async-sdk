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
 * {@link CreateWhitelistSettingResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWhitelistSettingResponseBody</p>
 */
public class CreateWhitelistSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private Boolean resultObject;

    private CreateWhitelistSettingResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWhitelistSettingResponseBody create() {
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

        private Builder(CreateWhitelistSettingResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>CF4979D3-060F-5336-BD9F-0D46ECB66B22</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return result, whether the creation was successful:</p>
         * <ul>
         * <li>true: Success</li>
         * <li>false: Failure</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder resultObject(Boolean resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public CreateWhitelistSettingResponseBody build() {
            return new CreateWhitelistSettingResponseBody(this);
        } 

    } 

}
