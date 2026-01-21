// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bsn20150512.models;

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
 * {@link GrantBsnCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GrantBsnCodeResponseBody</p>
 */
public class GrantBsnCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.NameInMap("GrantToAliuid")
    private Long grantToAliuid;

    @com.aliyun.core.annotation.NameInMap("Notes")
    private String notes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sn")
    private String sn;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GrantBsnCodeResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.grantToAliuid = builder.grantToAliuid;
        this.notes = builder.notes;
        this.requestId = builder.requestId;
        this.sn = builder.sn;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantBsnCodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return grantToAliuid
     */
    public Long getGrantToAliuid() {
        return this.grantToAliuid;
    }

    /**
     * @return notes
     */
    public String getNotes() {
        return this.notes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long aliUid; 
        private Long grantToAliuid; 
        private String notes; 
        private String requestId; 
        private String sn; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GrantBsnCodeResponseBody model) {
            this.aliUid = model.aliUid;
            this.grantToAliuid = model.grantToAliuid;
            this.notes = model.notes;
            this.requestId = model.requestId;
            this.sn = model.sn;
            this.success = model.success;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * GrantToAliuid.
         */
        public Builder grantToAliuid(Long grantToAliuid) {
            this.grantToAliuid = grantToAliuid;
            return this;
        }

        /**
         * Notes.
         */
        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Sn.
         */
        public Builder sn(String sn) {
            this.sn = sn;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GrantBsnCodeResponseBody build() {
            return new GrantBsnCodeResponseBody(this);
        } 

    } 

}
