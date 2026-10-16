// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link DeleteAccountResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAccountResponseBody</p>
 */
public class DeleteAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeletionType")
    private String deletionType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteAccountResponseBody(Builder builder) {
        this.deletionType = builder.deletionType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletionType
     */
    public String getDeletionType() {
        return this.deletionType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String deletionType; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteAccountResponseBody model) {
            this.deletionType = model.deletionType;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The deletion type. Valid values:</p>
         * <ul>
         * <li>0: Direct deletion. If the member has no pay-as-you-go resources in the last 30 days, the system directly deletes the member.</li>
         * <li>1: Cool-down period deletion. If the member has pay-as-you-go resources in the last 30 days, the member enters a cool-down period. The system starts to delete the member after the cool-down period ends. For more information about the cool-down period, see <a href="https://help.aliyun.com/document_detail/446079.html">What is the cool-down period for member deletion</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder deletionType(String deletionType) {
            this.deletionType = deletionType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>009429F8-C1C0-5872-B674-A6C2333B9647</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAccountResponseBody build() {
            return new DeleteAccountResponseBody(this);
        } 

    } 

}
