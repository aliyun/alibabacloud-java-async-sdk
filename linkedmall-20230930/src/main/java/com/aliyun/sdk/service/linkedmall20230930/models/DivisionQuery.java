// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link DivisionQuery} extends {@link TeaModel}
 *
 * <p>DivisionQuery</p>
 */
public class DivisionQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("divisionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String divisionCode;

    private DivisionQuery(Builder builder) {
        this.divisionCode = builder.divisionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DivisionQuery create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return divisionCode
     */
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public static final class Builder {
        private String divisionCode; 

        private Builder() {
        } 

        private Builder(DivisionQuery model) {
            this.divisionCode = model.divisionCode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder divisionCode(String divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }

        public DivisionQuery build() {
            return new DivisionQuery(this);
        } 

    } 

}
