// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link GetEmonAlarmRecordStatisticsDistributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetEmonAlarmRecordStatisticsDistributeResponseBody</p>
 */
public class GetEmonAlarmRecordStatisticsDistributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetEmonAlarmRecordStatisticsDistributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEmonAlarmRecordStatisticsDistributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetEmonAlarmRecordStatisticsDistributeResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBody build() {
            return new GetEmonAlarmRecordStatisticsDistributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEmonAlarmRecordStatisticsDistributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEmonAlarmRecordStatisticsDistributeResponseBody</p>
     */
    public static class AlarmGroupTotal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alarmGroup")
        private String alarmGroup;

        @com.aliyun.core.annotation.NameInMap("compare")
        private String compare;

        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("receiver")
        private String receiver;

        @com.aliyun.core.annotation.NameInMap("time")
        private Integer time;

        @com.aliyun.core.annotation.NameInMap("today")
        private Integer today;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("yesterday")
        private Integer yesterday;

        private AlarmGroupTotal(Builder builder) {
            this.alarmGroup = builder.alarmGroup;
            this.compare = builder.compare;
            this.count = builder.count;
            this.level = builder.level;
            this.receiver = builder.receiver;
            this.time = builder.time;
            this.today = builder.today;
            this.type = builder.type;
            this.yesterday = builder.yesterday;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmGroupTotal create() {
            return builder().build();
        }

        /**
         * @return alarmGroup
         */
        public String getAlarmGroup() {
            return this.alarmGroup;
        }

        /**
         * @return compare
         */
        public String getCompare() {
            return this.compare;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return receiver
         */
        public String getReceiver() {
            return this.receiver;
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return today
         */
        public Integer getToday() {
            return this.today;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return yesterday
         */
        public Integer getYesterday() {
            return this.yesterday;
        }

        public static final class Builder {
            private String alarmGroup; 
            private String compare; 
            private Integer count; 
            private String level; 
            private String receiver; 
            private Integer time; 
            private Integer today; 
            private String type; 
            private Integer yesterday; 

            private Builder() {
            } 

            private Builder(AlarmGroupTotal model) {
                this.alarmGroup = model.alarmGroup;
                this.compare = model.compare;
                this.count = model.count;
                this.level = model.level;
                this.receiver = model.receiver;
                this.time = model.time;
                this.today = model.today;
                this.type = model.type;
                this.yesterday = model.yesterday;
            } 

            /**
             * alarmGroup.
             */
            public Builder alarmGroup(String alarmGroup) {
                this.alarmGroup = alarmGroup;
                return this;
            }

            /**
             * compare.
             */
            public Builder compare(String compare) {
                this.compare = compare;
                return this;
            }

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * receiver.
             */
            public Builder receiver(String receiver) {
                this.receiver = receiver;
                return this;
            }

            /**
             * time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * today.
             */
            public Builder today(Integer today) {
                this.today = today;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * yesterday.
             */
            public Builder yesterday(Integer yesterday) {
                this.yesterday = yesterday;
                return this;
            }

            public AlarmGroupTotal build() {
                return new AlarmGroupTotal(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEmonAlarmRecordStatisticsDistributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEmonAlarmRecordStatisticsDistributeResponseBody</p>
     */
    public static class ChannelTotal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alarmGroup")
        private String alarmGroup;

        @com.aliyun.core.annotation.NameInMap("compare")
        private String compare;

        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("receiver")
        private String receiver;

        @com.aliyun.core.annotation.NameInMap("time")
        private Integer time;

        @com.aliyun.core.annotation.NameInMap("today")
        private Integer today;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("yesterday")
        private Integer yesterday;

        private ChannelTotal(Builder builder) {
            this.alarmGroup = builder.alarmGroup;
            this.compare = builder.compare;
            this.count = builder.count;
            this.level = builder.level;
            this.receiver = builder.receiver;
            this.time = builder.time;
            this.today = builder.today;
            this.type = builder.type;
            this.yesterday = builder.yesterday;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelTotal create() {
            return builder().build();
        }

        /**
         * @return alarmGroup
         */
        public String getAlarmGroup() {
            return this.alarmGroup;
        }

        /**
         * @return compare
         */
        public String getCompare() {
            return this.compare;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return receiver
         */
        public String getReceiver() {
            return this.receiver;
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return today
         */
        public Integer getToday() {
            return this.today;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return yesterday
         */
        public Integer getYesterday() {
            return this.yesterday;
        }

        public static final class Builder {
            private String alarmGroup; 
            private String compare; 
            private Integer count; 
            private String level; 
            private String receiver; 
            private Integer time; 
            private Integer today; 
            private String type; 
            private Integer yesterday; 

            private Builder() {
            } 

            private Builder(ChannelTotal model) {
                this.alarmGroup = model.alarmGroup;
                this.compare = model.compare;
                this.count = model.count;
                this.level = model.level;
                this.receiver = model.receiver;
                this.time = model.time;
                this.today = model.today;
                this.type = model.type;
                this.yesterday = model.yesterday;
            } 

            /**
             * alarmGroup.
             */
            public Builder alarmGroup(String alarmGroup) {
                this.alarmGroup = alarmGroup;
                return this;
            }

            /**
             * compare.
             */
            public Builder compare(String compare) {
                this.compare = compare;
                return this;
            }

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * receiver.
             */
            public Builder receiver(String receiver) {
                this.receiver = receiver;
                return this;
            }

            /**
             * time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * today.
             */
            public Builder today(Integer today) {
                this.today = today;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * yesterday.
             */
            public Builder yesterday(Integer yesterday) {
                this.yesterday = yesterday;
                return this;
            }

            public ChannelTotal build() {
                return new ChannelTotal(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEmonAlarmRecordStatisticsDistributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEmonAlarmRecordStatisticsDistributeResponseBody</p>
     */
    public static class LevelTotal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alarmGroup")
        private String alarmGroup;

        @com.aliyun.core.annotation.NameInMap("compare")
        private String compare;

        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("receiver")
        private String receiver;

        @com.aliyun.core.annotation.NameInMap("time")
        private Integer time;

        @com.aliyun.core.annotation.NameInMap("today")
        private Integer today;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("yesterday")
        private Integer yesterday;

        private LevelTotal(Builder builder) {
            this.alarmGroup = builder.alarmGroup;
            this.compare = builder.compare;
            this.count = builder.count;
            this.level = builder.level;
            this.receiver = builder.receiver;
            this.time = builder.time;
            this.today = builder.today;
            this.type = builder.type;
            this.yesterday = builder.yesterday;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LevelTotal create() {
            return builder().build();
        }

        /**
         * @return alarmGroup
         */
        public String getAlarmGroup() {
            return this.alarmGroup;
        }

        /**
         * @return compare
         */
        public String getCompare() {
            return this.compare;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return receiver
         */
        public String getReceiver() {
            return this.receiver;
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return today
         */
        public Integer getToday() {
            return this.today;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return yesterday
         */
        public Integer getYesterday() {
            return this.yesterday;
        }

        public static final class Builder {
            private String alarmGroup; 
            private String compare; 
            private Integer count; 
            private String level; 
            private String receiver; 
            private Integer time; 
            private Integer today; 
            private String type; 
            private Integer yesterday; 

            private Builder() {
            } 

            private Builder(LevelTotal model) {
                this.alarmGroup = model.alarmGroup;
                this.compare = model.compare;
                this.count = model.count;
                this.level = model.level;
                this.receiver = model.receiver;
                this.time = model.time;
                this.today = model.today;
                this.type = model.type;
                this.yesterday = model.yesterday;
            } 

            /**
             * alarmGroup.
             */
            public Builder alarmGroup(String alarmGroup) {
                this.alarmGroup = alarmGroup;
                return this;
            }

            /**
             * compare.
             */
            public Builder compare(String compare) {
                this.compare = compare;
                return this;
            }

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * receiver.
             */
            public Builder receiver(String receiver) {
                this.receiver = receiver;
                return this;
            }

            /**
             * time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * today.
             */
            public Builder today(Integer today) {
                this.today = today;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * yesterday.
             */
            public Builder yesterday(Integer yesterday) {
                this.yesterday = yesterday;
                return this;
            }

            public LevelTotal build() {
                return new LevelTotal(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEmonAlarmRecordStatisticsDistributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEmonAlarmRecordStatisticsDistributeResponseBody</p>
     */
    public static class ReceiverTotal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alarmGroup")
        private String alarmGroup;

        @com.aliyun.core.annotation.NameInMap("compare")
        private String compare;

        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("receiver")
        private String receiver;

        @com.aliyun.core.annotation.NameInMap("time")
        private Integer time;

        @com.aliyun.core.annotation.NameInMap("today")
        private Integer today;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("yesterday")
        private Integer yesterday;

        private ReceiverTotal(Builder builder) {
            this.alarmGroup = builder.alarmGroup;
            this.compare = builder.compare;
            this.count = builder.count;
            this.level = builder.level;
            this.receiver = builder.receiver;
            this.time = builder.time;
            this.today = builder.today;
            this.type = builder.type;
            this.yesterday = builder.yesterday;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReceiverTotal create() {
            return builder().build();
        }

        /**
         * @return alarmGroup
         */
        public String getAlarmGroup() {
            return this.alarmGroup;
        }

        /**
         * @return compare
         */
        public String getCompare() {
            return this.compare;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return receiver
         */
        public String getReceiver() {
            return this.receiver;
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return today
         */
        public Integer getToday() {
            return this.today;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return yesterday
         */
        public Integer getYesterday() {
            return this.yesterday;
        }

        public static final class Builder {
            private String alarmGroup; 
            private String compare; 
            private Integer count; 
            private String level; 
            private String receiver; 
            private Integer time; 
            private Integer today; 
            private String type; 
            private Integer yesterday; 

            private Builder() {
            } 

            private Builder(ReceiverTotal model) {
                this.alarmGroup = model.alarmGroup;
                this.compare = model.compare;
                this.count = model.count;
                this.level = model.level;
                this.receiver = model.receiver;
                this.time = model.time;
                this.today = model.today;
                this.type = model.type;
                this.yesterday = model.yesterday;
            } 

            /**
             * alarmGroup.
             */
            public Builder alarmGroup(String alarmGroup) {
                this.alarmGroup = alarmGroup;
                return this;
            }

            /**
             * compare.
             */
            public Builder compare(String compare) {
                this.compare = compare;
                return this;
            }

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * receiver.
             */
            public Builder receiver(String receiver) {
                this.receiver = receiver;
                return this;
            }

            /**
             * time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * today.
             */
            public Builder today(Integer today) {
                this.today = today;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * yesterday.
             */
            public Builder yesterday(Integer yesterday) {
                this.yesterday = yesterday;
                return this;
            }

            public ReceiverTotal build() {
                return new ReceiverTotal(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEmonAlarmRecordStatisticsDistributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEmonAlarmRecordStatisticsDistributeResponseBody</p>
     */
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alarmGroup")
        private String alarmGroup;

        @com.aliyun.core.annotation.NameInMap("compare")
        private String compare;

        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("receiver")
        private String receiver;

        @com.aliyun.core.annotation.NameInMap("time")
        private Integer time;

        @com.aliyun.core.annotation.NameInMap("today")
        private Integer today;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("yesterday")
        private Integer yesterday;

        private Statistics(Builder builder) {
            this.alarmGroup = builder.alarmGroup;
            this.compare = builder.compare;
            this.count = builder.count;
            this.level = builder.level;
            this.receiver = builder.receiver;
            this.time = builder.time;
            this.today = builder.today;
            this.type = builder.type;
            this.yesterday = builder.yesterday;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return alarmGroup
         */
        public String getAlarmGroup() {
            return this.alarmGroup;
        }

        /**
         * @return compare
         */
        public String getCompare() {
            return this.compare;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return receiver
         */
        public String getReceiver() {
            return this.receiver;
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return today
         */
        public Integer getToday() {
            return this.today;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return yesterday
         */
        public Integer getYesterday() {
            return this.yesterday;
        }

        public static final class Builder {
            private String alarmGroup; 
            private String compare; 
            private Integer count; 
            private String level; 
            private String receiver; 
            private Integer time; 
            private Integer today; 
            private String type; 
            private Integer yesterday; 

            private Builder() {
            } 

            private Builder(Statistics model) {
                this.alarmGroup = model.alarmGroup;
                this.compare = model.compare;
                this.count = model.count;
                this.level = model.level;
                this.receiver = model.receiver;
                this.time = model.time;
                this.today = model.today;
                this.type = model.type;
                this.yesterday = model.yesterday;
            } 

            /**
             * alarmGroup.
             */
            public Builder alarmGroup(String alarmGroup) {
                this.alarmGroup = alarmGroup;
                return this;
            }

            /**
             * compare.
             */
            public Builder compare(String compare) {
                this.compare = compare;
                return this;
            }

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * receiver.
             */
            public Builder receiver(String receiver) {
                this.receiver = receiver;
                return this;
            }

            /**
             * time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * today.
             */
            public Builder today(Integer today) {
                this.today = today;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * yesterday.
             */
            public Builder yesterday(Integer yesterday) {
                this.yesterday = yesterday;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEmonAlarmRecordStatisticsDistributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEmonAlarmRecordStatisticsDistributeResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alarmGroup")
        private String alarmGroup;

        @com.aliyun.core.annotation.NameInMap("alarmGroupTotal")
        private java.util.List<AlarmGroupTotal> alarmGroupTotal;

        @com.aliyun.core.annotation.NameInMap("channelTotal")
        private java.util.List<ChannelTotal> channelTotal;

        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("levelTotal")
        private java.util.List<LevelTotal> levelTotal;

        @com.aliyun.core.annotation.NameInMap("receiverTotal")
        private java.util.List<ReceiverTotal> receiverTotal;

        @com.aliyun.core.annotation.NameInMap("statistics")
        private java.util.List<Statistics> statistics;

        private Result(Builder builder) {
            this.alarmGroup = builder.alarmGroup;
            this.alarmGroupTotal = builder.alarmGroupTotal;
            this.channelTotal = builder.channelTotal;
            this.count = builder.count;
            this.levelTotal = builder.levelTotal;
            this.receiverTotal = builder.receiverTotal;
            this.statistics = builder.statistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return alarmGroup
         */
        public String getAlarmGroup() {
            return this.alarmGroup;
        }

        /**
         * @return alarmGroupTotal
         */
        public java.util.List<AlarmGroupTotal> getAlarmGroupTotal() {
            return this.alarmGroupTotal;
        }

        /**
         * @return channelTotal
         */
        public java.util.List<ChannelTotal> getChannelTotal() {
            return this.channelTotal;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return levelTotal
         */
        public java.util.List<LevelTotal> getLevelTotal() {
            return this.levelTotal;
        }

        /**
         * @return receiverTotal
         */
        public java.util.List<ReceiverTotal> getReceiverTotal() {
            return this.receiverTotal;
        }

        /**
         * @return statistics
         */
        public java.util.List<Statistics> getStatistics() {
            return this.statistics;
        }

        public static final class Builder {
            private String alarmGroup; 
            private java.util.List<AlarmGroupTotal> alarmGroupTotal; 
            private java.util.List<ChannelTotal> channelTotal; 
            private Integer count; 
            private java.util.List<LevelTotal> levelTotal; 
            private java.util.List<ReceiverTotal> receiverTotal; 
            private java.util.List<Statistics> statistics; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.alarmGroup = model.alarmGroup;
                this.alarmGroupTotal = model.alarmGroupTotal;
                this.channelTotal = model.channelTotal;
                this.count = model.count;
                this.levelTotal = model.levelTotal;
                this.receiverTotal = model.receiverTotal;
                this.statistics = model.statistics;
            } 

            /**
             * alarmGroup.
             */
            public Builder alarmGroup(String alarmGroup) {
                this.alarmGroup = alarmGroup;
                return this;
            }

            /**
             * alarmGroupTotal.
             */
            public Builder alarmGroupTotal(java.util.List<AlarmGroupTotal> alarmGroupTotal) {
                this.alarmGroupTotal = alarmGroupTotal;
                return this;
            }

            /**
             * channelTotal.
             */
            public Builder channelTotal(java.util.List<ChannelTotal> channelTotal) {
                this.channelTotal = channelTotal;
                return this;
            }

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * levelTotal.
             */
            public Builder levelTotal(java.util.List<LevelTotal> levelTotal) {
                this.levelTotal = levelTotal;
                return this;
            }

            /**
             * receiverTotal.
             */
            public Builder receiverTotal(java.util.List<ReceiverTotal> receiverTotal) {
                this.receiverTotal = receiverTotal;
                return this;
            }

            /**
             * statistics.
             */
            public Builder statistics(java.util.List<Statistics> statistics) {
                this.statistics = statistics;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
