// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link CreateScreenSettingResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScreenSettingResponseBody</p>
 */
public class CreateScreenSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Integer id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateScreenSettingResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScreenSettingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer id; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateScreenSettingResponseBody model) {
            this.id = model.id;
            this.requestId = model.requestId;
        } 

        /**
         * Id.
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateScreenSettingResponseBody build() {
            return new CreateScreenSettingResponseBody(this);
        } 

    } 

}
