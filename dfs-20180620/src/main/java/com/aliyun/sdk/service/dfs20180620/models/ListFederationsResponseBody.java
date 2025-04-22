// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link ListFederationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFederationsResponseBody</p>
 */
public class ListFederationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Federations")
    private java.util.List<Federations> federations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFederationsResponseBody(Builder builder) {
        this.federations = builder.federations;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFederationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return federations
     */
    public java.util.List<Federations> getFederations() {
        return this.federations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Federations> federations; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListFederationsResponseBody model) {
            this.federations = model.federations;
            this.requestId = model.requestId;
        } 

        /**
         * Federations.
         */
        public Builder federations(java.util.List<Federations> federations) {
            this.federations = federations;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFederationsResponseBody build() {
            return new ListFederationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFederationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFederationsResponseBody</p>
     */
    public static class Federations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FederationId")
        private String federationId;

        @com.aliyun.core.annotation.NameInMap("FileSystemIds")
        private String fileSystemIds;

        private Federations(Builder builder) {
            this.federationId = builder.federationId;
            this.fileSystemIds = builder.fileSystemIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Federations create() {
            return builder().build();
        }

        /**
         * @return federationId
         */
        public String getFederationId() {
            return this.federationId;
        }

        /**
         * @return fileSystemIds
         */
        public String getFileSystemIds() {
            return this.fileSystemIds;
        }

        public static final class Builder {
            private String federationId; 
            private String fileSystemIds; 

            private Builder() {
            } 

            private Builder(Federations model) {
                this.federationId = model.federationId;
                this.fileSystemIds = model.fileSystemIds;
            } 

            /**
             * FederationId.
             */
            public Builder federationId(String federationId) {
                this.federationId = federationId;
                return this;
            }

            /**
             * FileSystemIds.
             */
            public Builder fileSystemIds(String fileSystemIds) {
                this.fileSystemIds = fileSystemIds;
                return this;
            }

            public Federations build() {
                return new Federations(this);
            } 

        } 

    }
}
