// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetWarningThresholdRequest} extends {@link RequestModel}
 *
 * <p>SetWarningThresholdRequest</p>
 */
public class SetWarningThresholdRequest extends Request {
    @Query
    @NameInMap("Uid")
    @Validation(required = true)
    private Long uid;

    @Query
    @NameInMap("WarningValue")
    @Validation(required = true)
    private String warningValue;

    private SetWarningThresholdRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.warningValue = builder.warningValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetWarningThresholdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    /**
     * @return warningValue
     */
    public String getWarningValue() {
        return this.warningValue;
    }

    public static final class Builder extends Request.Builder<SetWarningThresholdRequest, Builder> {
        private Long uid; 
        private String warningValue; 

        private Builder() {
            super();
        } 

        private Builder(SetWarningThresholdRequest request) {
            super(request);
            this.uid = request.uid;
            this.warningValue = request.warningValue;
        } 

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * WarningValue.
         */
        public Builder warningValue(String warningValue) {
            this.putQueryParameter("WarningValue", warningValue);
            this.warningValue = warningValue;
            return this;
        }

        @Override
        public SetWarningThresholdRequest build() {
            return new SetWarningThresholdRequest(this);
        } 

    } 

}
