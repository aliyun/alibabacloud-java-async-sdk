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
 * {@link CreateHotwordLibraryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHotwordLibraryResponseBody</p>
 */
public class CreateHotwordLibraryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HotwordLibraryId")
    private String hotwordLibraryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateHotwordLibraryResponseBody(Builder builder) {
        this.hotwordLibraryId = builder.hotwordLibraryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHotwordLibraryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotwordLibraryId
     */
    public String getHotwordLibraryId() {
        return this.hotwordLibraryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hotwordLibraryId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateHotwordLibraryResponseBody model) {
            this.hotwordLibraryId = model.hotwordLibraryId;
            this.requestId = model.requestId;
        } 

        /**
         * HotwordLibraryId.
         */
        public Builder hotwordLibraryId(String hotwordLibraryId) {
            this.hotwordLibraryId = hotwordLibraryId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>13cbb83e-043c-4728-ac35-*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHotwordLibraryResponseBody build() {
            return new CreateHotwordLibraryResponseBody(this);
        } 

    } 

}
