// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeCheckWarningDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeCheckWarningDetailRequest</p>
 */
public class DescribeCheckWarningDetailRequest extends Request {
    @Query
    @NameInMap("CheckWarningId")
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

    public static final class Builder extends Request.Builder {
        private Long checkWarningId; 
        private String lang; 
        private String sourceIp; 

        /**
         * <p>CheckWarningId.</p>
         */
        public Builder checkWarningId(Long checkWarningId) {
            this.putQueryParameter("CheckWarningId", checkWarningId);
            this.checkWarningId = checkWarningId;
            return this;
        }

        /**
         * <p>Lang.</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        public DescribeCheckWarningDetailRequest build() {
            return new DescribeCheckWarningDetailRequest(this);
        } 

    } 

}
