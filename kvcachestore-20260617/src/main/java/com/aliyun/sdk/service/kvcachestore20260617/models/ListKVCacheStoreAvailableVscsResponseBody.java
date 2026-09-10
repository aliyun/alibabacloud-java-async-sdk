// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kvcachestore20260617.models;

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
 * {@link ListKVCacheStoreAvailableVscsResponseBody} extends {@link TeaModel}
 *
 * <p>ListKVCacheStoreAvailableVscsResponseBody</p>
 */
public class ListKVCacheStoreAvailableVscsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Vscs")
    private java.util.List<Vscs> vscs;

    private ListKVCacheStoreAvailableVscsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vscs = builder.vscs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKVCacheStoreAvailableVscsResponseBody create() {
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
     * @return vscs
     */
    public java.util.List<Vscs> getVscs() {
        return this.vscs;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Vscs> vscs; 

        private Builder() {
        } 

        private Builder(ListKVCacheStoreAvailableVscsResponseBody model) {
            this.requestId = model.requestId;
            this.vscs = model.vscs;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-id-xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of available VSC resources.</p>
         */
        public Builder vscs(java.util.List<Vscs> vscs) {
            this.vscs = vscs;
            return this;
        }

        public ListKVCacheStoreAvailableVscsResponseBody build() {
            return new ListKVCacheStoreAvailableVscsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKVCacheStoreAvailableVscsResponseBody} extends {@link TeaModel}
     *
     * <p>ListKVCacheStoreAvailableVscsResponseBody</p>
     */
    public static class Vscs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VscId")
        private String vscId;

        @com.aliyun.core.annotation.NameInMap("VscStatus")
        private String vscStatus;

        private Vscs(Builder builder) {
            this.vscId = builder.vscId;
            this.vscStatus = builder.vscStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vscs create() {
            return builder().build();
        }

        /**
         * @return vscId
         */
        public String getVscId() {
            return this.vscId;
        }

        /**
         * @return vscStatus
         */
        public String getVscStatus() {
            return this.vscStatus;
        }

        public static final class Builder {
            private String vscId; 
            private String vscStatus; 

            private Builder() {
            } 

            private Builder(Vscs model) {
                this.vscId = model.vscId;
                this.vscStatus = model.vscStatus;
            } 

            /**
             * <p>The ID of the VSC device.</p>
             * 
             * <strong>example:</strong>
             * <p>vsc-xxxxx</p>
             */
            public Builder vscId(String vscId) {
                this.vscId = vscId;
                return this;
            }

            /**
             * <p>The current status of the VSC device.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder vscStatus(String vscStatus) {
                this.vscStatus = vscStatus;
                return this;
            }

            public Vscs build() {
                return new Vscs(this);
            } 

        } 

    }
}
