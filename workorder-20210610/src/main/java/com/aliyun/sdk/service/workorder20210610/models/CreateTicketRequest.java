// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTicketRequest} extends {@link RequestModel}
 *
 * <p>CreateTicketRequest</p>
 */
public class CreateTicketRequest extends Request {
    @Body
    @NameInMap("CategoryId")
    @Validation(required = true)
    private String categoryId;

    @Body
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Body
    @NameInMap("Severity")
    @Validation(required = true, maximum = 1000)
    private Integer severity;

    private CreateTicketRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.description = builder.description;
        this.severity = builder.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTicketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return severity
     */
    public Integer getSeverity() {
        return this.severity;
    }

    public static final class Builder extends Request.Builder<CreateTicketRequest, Builder> {
        private String categoryId; 
        private String description; 
        private Integer severity; 

        private Builder() {
            super();
        } 

        private Builder(CreateTicketRequest response) {
            super(response);
            this.categoryId = response.categoryId;
            this.description = response.description;
            this.severity = response.severity;
        } 

        /**
         * CategoryId.
         */
        public Builder categoryId(String categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Severity.
         */
        public Builder severity(Integer severity) {
            this.putBodyParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        @Override
        public CreateTicketRequest build() {
            return new CreateTicketRequest(this);
        } 

    } 

}
