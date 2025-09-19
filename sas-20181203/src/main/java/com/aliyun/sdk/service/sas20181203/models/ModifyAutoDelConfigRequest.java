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
 * {@link ModifyAutoDelConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoDelConfigRequest</p>
 */
public class ModifyAutoDelConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Days")
    private Integer days;

    private ModifyAutoDelConfigRequest(Builder builder) {
        super(builder);
        this.days = builder.days;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAutoDelConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return days
     */
    public Integer getDays() {
        return this.days;
    }

    public static final class Builder extends Request.Builder<ModifyAutoDelConfigRequest, Builder> {
        private Integer days; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoDelConfigRequest request) {
            super(request);
            this.days = request.days;
        } 

        /**
         * <p>The number of days after which a detected vulnerability is automatically deleted. Unit: days. Valid values:</p>
         * <ul>
         * <li>7</li>
         * <li>30</li>
         * <li>90</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder days(Integer days) {
            this.putQueryParameter("Days", days);
            this.days = days;
            return this;
        }

        @Override
        public ModifyAutoDelConfigRequest build() {
            return new ModifyAutoDelConfigRequest(this);
        } 

    } 

}
