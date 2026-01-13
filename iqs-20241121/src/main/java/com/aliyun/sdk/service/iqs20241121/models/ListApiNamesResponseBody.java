// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link ListApiNamesResponseBody} extends {@link TeaModel}
 *
 * <p>ListApiNamesResponseBody</p>
 */
public class ListApiNamesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiNames")
    private java.util.List<String> apiNames;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListApiNamesResponseBody(Builder builder) {
        this.apiNames = builder.apiNames;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiNamesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiNames
     */
    public java.util.List<String> getApiNames() {
        return this.apiNames;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> apiNames; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListApiNamesResponseBody model) {
            this.apiNames = model.apiNames;
            this.requestId = model.requestId;
        } 

        /**
         * apiNames.
         */
        public Builder apiNames(java.util.List<String> apiNames) {
            this.apiNames = apiNames;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>ECB2144C-E277-5434-80E6-12D26678D364</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApiNamesResponseBody build() {
            return new ListApiNamesResponseBody(this);
        } 

    } 

}
