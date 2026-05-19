// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListFileProtectClientRuleFileTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListFileProtectClientRuleFileTypeResponseBody</p>
 */
public class ListFileProtectClientRuleFileTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileTypes")
    private java.util.List<String> fileTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFileProtectClientRuleFileTypeResponseBody(Builder builder) {
        this.fileTypes = builder.fileTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileProtectClientRuleFileTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileTypes
     */
    public java.util.List<String> getFileTypes() {
        return this.fileTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> fileTypes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListFileProtectClientRuleFileTypeResponseBody model) {
            this.fileTypes = model.fileTypes;
            this.requestId = model.requestId;
        } 

        /**
         * FileTypes.
         */
        public Builder fileTypes(java.util.List<String> fileTypes) {
            this.fileTypes = fileTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFileProtectClientRuleFileTypeResponseBody build() {
            return new ListFileProtectClientRuleFileTypeResponseBody(this);
        } 

    } 

}
