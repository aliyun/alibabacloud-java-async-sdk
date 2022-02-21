// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRecordRemarkRequest} extends {@link RequestModel}
 *
 * <p>UpdateRecordRemarkRequest</p>
 */
public class UpdateRecordRemarkRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RecordId")
    @Validation(required = true)
    private Long recordId;

    @Query
    @NameInMap("Remark")
    private String remark;

    private UpdateRecordRemarkRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.recordId = builder.recordId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRecordRemarkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<UpdateRecordRemarkRequest, Builder> {
        private String lang; 
        private Long recordId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRecordRemarkRequest response) {
            super(response);
            this.lang = response.lang;
            this.recordId = response.recordId;
            this.remark = response.remark;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RecordId.
         */
        public Builder recordId(Long recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public UpdateRecordRemarkRequest build() {
            return new UpdateRecordRemarkRequest(this);
        } 

    } 

}
