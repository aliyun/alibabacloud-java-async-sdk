// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeletePolarOSSAuthorizedAccountResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePolarOSSAuthorizedAccountResponseBody</p>
 */
public class DeletePolarOSSAuthorizedAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizedUserArnIds")
    private String authorizedUserArnIds;

    @com.aliyun.core.annotation.NameInMap("AuthorizedUserIds")
    private String authorizedUserIds;

    @com.aliyun.core.annotation.NameInMap("PfsInstanceId")
    private String pfsInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeletePolarOSSAuthorizedAccountResponseBody(Builder builder) {
        this.authorizedUserArnIds = builder.authorizedUserArnIds;
        this.authorizedUserIds = builder.authorizedUserIds;
        this.pfsInstanceId = builder.pfsInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolarOSSAuthorizedAccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizedUserArnIds
     */
    public String getAuthorizedUserArnIds() {
        return this.authorizedUserArnIds;
    }

    /**
     * @return authorizedUserIds
     */
    public String getAuthorizedUserIds() {
        return this.authorizedUserIds;
    }

    /**
     * @return pfsInstanceId
     */
    public String getPfsInstanceId() {
        return this.pfsInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String authorizedUserArnIds; 
        private String authorizedUserIds; 
        private String pfsInstanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeletePolarOSSAuthorizedAccountResponseBody model) {
            this.authorizedUserArnIds = model.authorizedUserArnIds;
            this.authorizedUserIds = model.authorizedUserIds;
            this.pfsInstanceId = model.pfsInstanceId;
            this.requestId = model.requestId;
        } 

        /**
         * AuthorizedUserArnIds.
         */
        public Builder authorizedUserArnIds(String authorizedUserArnIds) {
            this.authorizedUserArnIds = authorizedUserArnIds;
            return this;
        }

        /**
         * AuthorizedUserIds.
         */
        public Builder authorizedUserIds(String authorizedUserIds) {
            this.authorizedUserIds = authorizedUserIds;
            return this;
        }

        /**
         * PfsInstanceId.
         */
        public Builder pfsInstanceId(String pfsInstanceId) {
            this.pfsInstanceId = pfsInstanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeletePolarOSSAuthorizedAccountResponseBody build() {
            return new DeletePolarOSSAuthorizedAccountResponseBody(this);
        } 

    } 

}
