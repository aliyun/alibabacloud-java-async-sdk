// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ExportSuspEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ExportSuspEventsResponseBody</p>
 */
public class ExportSuspEventsResponseBody extends TeaModel {
    @NameInMap("FileName")
    private Integer fileName;

    @NameInMap("Id")
    private Integer id;

    @NameInMap("RequestId")
    private String requestId;


    private ExportSuspEventsResponseBody(Builder builder) {
        this.fileName = builder.fileName;
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportSuspEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileName
     */
    public Integer getFileName() {
        return this.fileName;
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
        private Integer fileName; 
        private Integer id; 
        private String requestId; 

        /**
         * <p>FileName.</p>
         */
        public Builder fileName(Integer fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>Id.</p>
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportSuspEventsResponseBody build() {
            return new ExportSuspEventsResponseBody(this);
        } 

    } 

}
