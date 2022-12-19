// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckWarningDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeCheckWarningDetailRequest</p>
 */
public class DescribeCheckWarningDetailRequest extends Request {
    @Query
    @NameInMap("CheckWarningId")
    @Validation(required = true)
    private Long checkWarningId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeCheckWarningDetailRequest(Builder builder) {
        super(builder);
        this.checkWarningId = builder.checkWarningId;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckWarningDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkWarningId
     */
    public Long getCheckWarningId() {
        return this.checkWarningId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeCheckWarningDetailRequest, Builder> {
        private Long checkWarningId; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCheckWarningDetailRequest request) {
            super(request);
            this.checkWarningId = request.checkWarningId;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The ID of the alert that is triggered by the check item.
         * <p>
         * 
         * >  To query the details about a specified check item, you must provide the ID of the alert that is triggered by the check item. You can call the [DescribeCheckWarnings](~~DescribeCheckWarnings~~) operation to query the IDs of alerts.
         */
        public Builder checkWarningId(Long checkWarningId) {
            this.putQueryParameter("CheckWarningId", checkWarningId);
            this.checkWarningId = checkWarningId;
            return this;
        }

        /**
         * The language of the content within the request and the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeCheckWarningDetailRequest build() {
            return new DescribeCheckWarningDetailRequest(this);
        } 

    } 

}
