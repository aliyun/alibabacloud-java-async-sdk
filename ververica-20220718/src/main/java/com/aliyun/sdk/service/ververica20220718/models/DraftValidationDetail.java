// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link DraftValidationDetail} extends {@link TeaModel}
 *
 * <p>DraftValidationDetail</p>
 */
public class DraftValidationDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("draftMetaInfoErrorDetails")
    private java.util.List<DraftMetaInfoErrorDetail> draftMetaInfoErrorDetails;

    @com.aliyun.core.annotation.NameInMap("sqlErrorDetail")
    private ValidationErrorDetails sqlErrorDetail;

    @com.aliyun.core.annotation.NameInMap("sqlValidationResult")
    private String sqlValidationResult;

    private DraftValidationDetail(Builder builder) {
        this.draftMetaInfoErrorDetails = builder.draftMetaInfoErrorDetails;
        this.sqlErrorDetail = builder.sqlErrorDetail;
        this.sqlValidationResult = builder.sqlValidationResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DraftValidationDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return draftMetaInfoErrorDetails
     */
    public java.util.List<DraftMetaInfoErrorDetail> getDraftMetaInfoErrorDetails() {
        return this.draftMetaInfoErrorDetails;
    }

    /**
     * @return sqlErrorDetail
     */
    public ValidationErrorDetails getSqlErrorDetail() {
        return this.sqlErrorDetail;
    }

    /**
     * @return sqlValidationResult
     */
    public String getSqlValidationResult() {
        return this.sqlValidationResult;
    }

    public static final class Builder {
        private java.util.List<DraftMetaInfoErrorDetail> draftMetaInfoErrorDetails; 
        private ValidationErrorDetails sqlErrorDetail; 
        private String sqlValidationResult; 

        private Builder() {
        } 

        private Builder(DraftValidationDetail model) {
            this.draftMetaInfoErrorDetails = model.draftMetaInfoErrorDetails;
            this.sqlErrorDetail = model.sqlErrorDetail;
            this.sqlValidationResult = model.sqlValidationResult;
        } 

        /**
         * draftMetaInfoErrorDetails.
         */
        public Builder draftMetaInfoErrorDetails(java.util.List<DraftMetaInfoErrorDetail> draftMetaInfoErrorDetails) {
            this.draftMetaInfoErrorDetails = draftMetaInfoErrorDetails;
            return this;
        }

        /**
         * sqlErrorDetail.
         */
        public Builder sqlErrorDetail(ValidationErrorDetails sqlErrorDetail) {
            this.sqlErrorDetail = sqlErrorDetail;
            return this;
        }

        /**
         * sqlValidationResult.
         */
        public Builder sqlValidationResult(String sqlValidationResult) {
            this.sqlValidationResult = sqlValidationResult;
            return this;
        }

        public DraftValidationDetail build() {
            return new DraftValidationDetail(this);
        } 

    } 

}
