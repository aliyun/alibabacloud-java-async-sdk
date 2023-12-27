// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDcdnSubTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDcdnSubTaskRequest</p>
 */
public class CreateDcdnSubTaskRequest extends Request {
    @Body
    @NameInMap("DomainName")
    private String domainName;

    @Body
    @NameInMap("ReportIds")
    @Validation(required = true)
    private String reportIds;

    private CreateDcdnSubTaskRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.reportIds = builder.reportIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDcdnSubTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return reportIds
     */
    public String getReportIds() {
        return this.reportIds;
    }

    public static final class Builder extends Request.Builder<CreateDcdnSubTaskRequest, Builder> {
        private String domainName; 
        private String reportIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateDcdnSubTaskRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.reportIds = request.reportIds;
        } 

        /**
         * [](https://workorder-intl.console.aliyun.com/?spm=5176.2020520001.aliyun_topbar.18.dbd44bd3e4f845#/ticket/createIndex)
         * <p>
         * 
         * **
         * 
         * ****
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * *   ****
         * <p>
         * *   ****
         * *   ****
         * *   ****
         * *   ****
         * *   ****
         * *   ****
         * *   ****
         * *   ****
         * *   ****
         * *   ****
         * *   ****
         */
        public Builder reportIds(String reportIds) {
            this.putBodyParameter("ReportIds", reportIds);
            this.reportIds = reportIds;
            return this;
        }

        @Override
        public CreateDcdnSubTaskRequest build() {
            return new CreateDcdnSubTaskRequest(this);
        } 

    } 

}
