// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeSuspEventExportInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeSuspEventExportInfoRequest</p>
 */
public class DescribeSuspEventExportInfoRequest extends Request {
    @Query
    @NameInMap("ExportId")
    private Integer exportId;

    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;


    private DescribeSuspEventExportInfoRequest(Builder builder) {
        super(builder);
        this.exportId = builder.exportId;
        this.from = builder.from;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventExportInfoRequest create() {
        return builder().build();
    }

    /**
     * @return exportId
     */
    public Integer getExportId() {
        return this.exportId;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private Integer exportId; 
        private String from; 
        private String sourceIp; 

        /**
         * <p>ExportId.</p>
         */
        public Builder exportId(Integer exportId) {
            this.putQueryParameter("ExportId", exportId);
            this.exportId = exportId;
            return this;
        }

        /**
         * <p>From.</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
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

        public DescribeSuspEventExportInfoRequest build() {
            return new DescribeSuspEventExportInfoRequest(this);
        } 

    } 

}
