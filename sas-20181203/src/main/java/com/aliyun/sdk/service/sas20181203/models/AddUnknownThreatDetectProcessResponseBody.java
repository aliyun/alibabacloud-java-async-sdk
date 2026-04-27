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
 * {@link AddUnknownThreatDetectProcessResponseBody} extends {@link TeaModel}
 *
 * <p>AddUnknownThreatDetectProcessResponseBody</p>
 */
public class AddUnknownThreatDetectProcessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IdList")
    private java.util.List<IdList> idList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddUnknownThreatDetectProcessResponseBody(Builder builder) {
        this.idList = builder.idList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUnknownThreatDetectProcessResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return idList
     */
    public java.util.List<IdList> getIdList() {
        return this.idList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<IdList> idList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddUnknownThreatDetectProcessResponseBody model) {
            this.idList = model.idList;
            this.requestId = model.requestId;
        } 

        /**
         * IdList.
         */
        public Builder idList(java.util.List<IdList> idList) {
            this.idList = idList;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>ADE57832-9666-511C-9A80-B87DE2E8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddUnknownThreatDetectProcessResponseBody build() {
            return new AddUnknownThreatDetectProcessResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddUnknownThreatDetectProcessResponseBody} extends {@link TeaModel}
     *
     * <p>AddUnknownThreatDetectProcessResponseBody</p>
     */
    public static class IdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private IdList(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            private Builder() {
            } 

            private Builder(IdList model) {
                this.id = model.id;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public IdList build() {
                return new IdList(this);
            } 

        } 

    }
}
