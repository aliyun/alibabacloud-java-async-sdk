// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link SelectRequest} extends {@link RequestModel}
 *
 * <p>SelectRequest</p>
 */
public class SelectRequest extends Request {
    @NameInMap("Expression")
    private String expression;


    private SelectRequest(Builder builder) {
        super(builder);
        this.expression = builder.expression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectRequest create() {
        return builder().build();
    }

    /**
     * @return expression
     */
    public String expression() {
        return this.expression;
    }

    public static final class Builder extends Request.Builder<SelectRequest.Builder> {
        private String expression; 

        /**
         * <p>description</p>
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        public SelectRequest build() {
            return new SelectRequest(this);
        } 

    } 

}
