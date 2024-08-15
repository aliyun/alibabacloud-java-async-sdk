// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The type of the deletion. Valid values:
         * <p>
         * 
         * *   0: direct deletion. If the member does not have pay-as-you-go resources that are purchased within the previous 30 days, the system directly deletes the member.
         * *   1: deletion with a silence period. If the member has pay-as-you-go resources that are purchased within the previous 30 days, the member enters a silence period. The system starts to delete the member until the silence period ends. For more information about the silence period, see [What is the silence period for member deletion?](~~446079~~)
         */
        public Builder deletionType(String deletionType) {
            this.deletionType = deletionType;
            return this;
        }

        /**
         * The ID of the request.
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
