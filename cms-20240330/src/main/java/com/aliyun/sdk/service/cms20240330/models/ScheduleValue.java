// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ScheduleValue} extends {@link TeaModel}
 *
 * <p>ScheduleValue</p>
 */
public class ScheduleValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contactId")
    private String contactId;

    @com.aliyun.core.annotation.NameInMap("contactName")
    private String contactName;

    @com.aliyun.core.annotation.NameInMap("end")
    private String end;

    @com.aliyun.core.annotation.NameInMap("start")
    private String start;

    private ScheduleValue(Builder builder) {
        this.contactId = builder.contactId;
        this.contactName = builder.contactName;
        this.end = builder.end;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScheduleValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return end
     */
    public String getEnd() {
        return this.end;
    }

    /**
     * @return start
     */
    public String getStart() {
        return this.start;
    }

    public static final class Builder {
        private String contactId; 
        private String contactName; 
        private String end; 
        private String start; 

        private Builder() {
        } 

        private Builder(ScheduleValue model) {
            this.contactId = model.contactId;
            this.contactName = model.contactName;
            this.end = model.end;
            this.start = model.start;
        } 

        /**
         * contactId.
         */
        public Builder contactId(String contactId) {
            this.contactId = contactId;
            return this;
        }

        /**
         * contactName.
         */
        public Builder contactName(String contactName) {
            this.contactName = contactName;
            return this;
        }

        /**
         * end.
         */
        public Builder end(String end) {
            this.end = end;
            return this;
        }

        /**
         * start.
         */
        public Builder start(String start) {
            this.start = start;
            return this;
        }

        public ScheduleValue build() {
            return new ScheduleValue(this);
        } 

    } 

}
