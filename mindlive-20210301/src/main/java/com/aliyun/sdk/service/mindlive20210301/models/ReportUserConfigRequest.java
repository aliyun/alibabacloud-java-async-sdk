// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportUserConfigRequest} extends {@link RequestModel}
 *
 * <p>ReportUserConfigRequest</p>
 */
public class ReportUserConfigRequest extends Request {
    @Query
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    @Query
    @NameInMap("Value")
    private String value;

    private ReportUserConfigRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportUserConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<ReportUserConfigRequest, Builder> {
        private String key; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(ReportUserConfigRequest request) {
            super(request);
            this.key = request.key;
            this.value = request.value;
        } 

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public ReportUserConfigRequest build() {
            return new ReportUserConfigRequest(this);
        } 

    } 

}
