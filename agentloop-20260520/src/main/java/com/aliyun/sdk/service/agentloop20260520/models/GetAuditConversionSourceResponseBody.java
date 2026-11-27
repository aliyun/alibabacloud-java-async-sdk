// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link GetAuditConversionSourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuditConversionSourceResponseBody</p>
 */
public class GetAuditConversionSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.NameInMap("selected")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean selected;

    private GetAuditConversionSourceResponseBody(Builder builder) {
        this.id = builder.id;
        this.selected = builder.selected;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuditConversionSourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return selected
     */
    public Boolean getSelected() {
        return this.selected;
    }

    public static final class Builder {
        private String id; 
        private Boolean selected; 

        private Builder() {
        } 

        private Builder(GetAuditConversionSourceResponseBody model) {
            this.id = model.id;
            this.selected = model.selected;
        } 

        /**
         * <p>The normalized ID of the transformation object.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-A</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Indicates whether the object is selected for the transformation list of the current type. Valid values:</p>
         * <ul>
         * <li>true: The object is selected.</li>
         * <li>false: The object is not selected. This value is also returned when no audit configuration exists. It does not indicate whether the object is online or the task is healthy.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder selected(Boolean selected) {
            this.selected = selected;
            return this;
        }

        public GetAuditConversionSourceResponseBody build() {
            return new GetAuditConversionSourceResponseBody(this);
        } 

    } 

}
